package MultiThreadingDemo;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
 private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
    while (true){
        try {
            Thread.sleep(1000);
            queue.put(BlockingQueueDemo.counter++);
            System.out.println("Value Added in the queue "+BlockingQueueDemo.counter);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}

class Consumer implements Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(5000);
                queue.take();
                BlockingQueueDemo.counter--;
                System.out.println("Value deducted in the queue "+BlockingQueueDemo.counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}





public class BlockingQueueDemo {
    static int counter=0;
    public static void main(String[] args) {
    ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(10);
    Producer producer=new Producer(queue);
    Thread producerThread = new Thread(producer);
    producerThread.start();

    Consumer consume= new Consumer(queue);
    Thread consumerThread = new Thread(consume);
    consumerThread.start();
    }
}
