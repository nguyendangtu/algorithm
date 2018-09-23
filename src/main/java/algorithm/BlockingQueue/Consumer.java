package algorithm.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue q) {
        this.queue = q;
    }

    public void run() {
        try {
            System.out.println(queue.take());
        } catch (InterruptedException e) {

        }
    }

    public static void main(String args[]) {
        BlockingQueue<Integer> queue = new BlockingQueueImpl<Integer>();
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);
        new Thread(p).start();
        new Thread(c).start();
    }


}
