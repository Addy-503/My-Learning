package MultiThreadingDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Somethreads extends Thread {
    private String name;

    @Override
    public void run() {
        System.out.println("Starting of thread: " + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of thread :"+name);
    }

    public Somethreads(String name) {

        this.name = name;


    }
}


public class Threadpool {
    public static void main(String[] args) {
      // With the help of executorServices we can control the no of executable threads as below we gave as 2 so only two threads at a time will get executed.
        ExecutorService execute = Executors.newFixedThreadPool(2);
        Thread thread1 = new Somethreads("thread1");
        Thread thread2 = new Somethreads("thread2");
        Thread thread3 = new Somethreads("thread3");
        Thread thread4 = new Somethreads("thread4");
        Thread thread5 = new Somethreads("thread5");
        Thread thread6 = new Somethreads("thread6");
        Thread thread7 = new Somethreads("thread7");
        execute.execute(thread1);
        execute.execute(thread2);
        execute.execute(thread3);
        execute.execute(thread4);
        execute.execute(thread5);
        execute.execute(thread6);
        execute.execute(thread7);
        execute.shutdown();




    }

}
