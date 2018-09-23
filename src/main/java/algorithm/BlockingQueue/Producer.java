package algorithm.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue queue;

    public Producer(BlockingQueue q) {
        this.queue = q;
    }

    public void run() {
        try {
            this.queue.put(1);
        } catch (InterruptedException e) {

        }
    }

    Object createObject() {
        Integer obj = new Integer(1);
        return obj;
    }
}
