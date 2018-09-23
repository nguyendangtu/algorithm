package algorithm.BlockingQueue;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BlockingQueueImpl<E> extends AbstractQueue<E>
        implements BlockingQueue<E>, java.io.Serializable {
    private static final long serialVersionUID = -6903933977591709194L;

    private final int capacity;

    AtomicInteger count = new AtomicInteger();

    private final ReentrantLock takeLock = new ReentrantLock();

    private final Condition notEmpty = takeLock.newCondition();

    /**
     * Lock held by put, offer, etc
     */
    private final ReentrantLock putLock = new ReentrantLock();

    /**
     * Wait queue for waiting puts
     */
    private final Condition notFull = putLock.newCondition();

    transient BlockingQueueImpl.Node<E> head;

    /**
     * Tail of linked list.
     * Invariant: last.next == null
     */
    private transient BlockingQueueImpl.Node<E> last;


    public BlockingQueueImpl() {
        this(Integer.MAX_VALUE);
    }

    public BlockingQueueImpl(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException();
        this.capacity = capacity;
        last = head = new BlockingQueueImpl.Node<E>(null);
    }

    public Iterator<E> iterator() {
        return null;
    }

    public int size() {
        return count.get();
    }

    private void enqueue(BlockingQueueImpl.Node<E> node) {
        // assert putLock.isHeldByCurrentThread();
        // assert last.next == null;
        last = last.next = node;
    }

    public void put(E e) throws InterruptedException {
        if (null == e) throw new NullPointerException();
        int c;
        Node<E> node = new Node<E>(e);
        final ReentrantLock putLock = this.putLock;
        final AtomicInteger count = this.count;
        putLock.lockInterruptibly();
        try {
            while (count.get() == capacity) {
                notFull.await();
            }
            enqueue(node);
            c = count.getAndIncrement();
            if (c + 1 < capacity) {
                notFull.signal();
            }
        } finally {
            putLock.unlock();
        }
    }

    public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    public E take() throws InterruptedException {
        E x;
        int c = -1;
        final AtomicInteger count = this.count;
        final ReentrantLock takeLock = this.takeLock;
        takeLock.lockInterruptibly();
        try {
            if (count.get() == 0) {
                notEmpty.await();
            }
            x = dequeue();
            c = count.getAndDecrement();
            if (c > 0) {
                notEmpty.signal();
            }
        } finally {
            takeLock.unlock();
        }
        if (c == capacity) {
            signalNotFull();
        }
        return x;
    }

    private E dequeue() {
        // assert takeLock.isHeldByCurrentThread();
        // assert head.item == null;
        BlockingQueueImpl.Node<E> h = head;
        BlockingQueueImpl.Node<E> first = h.next;
        h.next = h; // help GC
        head = first;
        E x = first.item;
        first.item = null;
        return x;
    }

    static class Node<E> {
        E item;

        /**
         * One of:
         * - the real successor Node
         * - this Node, meaning the successor is head.next
         * - null, meaning there is no successor (this is the last node)
         */
        BlockingQueueImpl.Node<E> next;

        Node(E x) {
            item = x;
        }
    }

    private void signalNotFull() {
        final ReentrantLock putLock = this.putLock;
        putLock.lock();
        try {
            notFull.signal();
        } finally {
            putLock.unlock();
        }
    }


    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        return null;
    }

    public int remainingCapacity() {
        return 0;
    }

    public int drainTo(Collection<? super E> c) {
        return 0;
    }

    public int drainTo(Collection<? super E> c, int maxElements) {
        return 0;
    }

    public boolean offer(E e) {
        return false;
    }

    public E poll() {
        return null;
    }

    public E peek() {
        return null;
    }
}
