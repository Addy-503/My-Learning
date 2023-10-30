package MultiThreadingDemo;

import java.util.concurrent.CountDownLatch;

class newthreads extends Thread{
    private CountDownLatch latchno;

    public newthreads(CountDownLatch latchno) {
        this.latchno = latchno;
    }

    public void run() {
        System.out.println("Thread running with threadname: "+Thread.currentThread().getName());
        System.out.println("Thread Execution Completed");
        System.out.println("************");
        latchno.countDown();
    }

    }






public class LatchDemo {
    public static void main(String[] args) {
   CountDownLatch latch = new CountDownLatch(4);
        newthreads thread1= new newthreads(latch);
        newthreads thread2= new newthreads(latch);
        newthreads thread3= new newthreads(latch);
        newthreads thread4= new newthreads(latch);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("In main thread");


    }
}
