package taco.q4.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnable = () -> {
            int i = 0;
            while (true){
                System.out.println(Thread.currentThread().getName() + " Thread is running..." + i++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }            }
        };

        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.shutdown();
    }
}
