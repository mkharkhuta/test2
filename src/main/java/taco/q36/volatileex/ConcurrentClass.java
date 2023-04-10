package taco.q36.volatileex;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class ConcurrentClass {
    static volatile int val = 0;

    public static void main(String[] args) throws InterruptedException {
        var executorService = Executors.newFixedThreadPool(3);
        executorService.submit(ConcurrentClass::doIncrement);
        executorService.submit(ConcurrentClass::doIncrement);
        executorService.submit(ConcurrentClass::doIncrement);
        Thread.sleep(500);
        System.out.println("result " + val);
        executorService.shutdown();
    }

    private static void doIncrement() {
        System.out.println("Outside " + Thread.currentThread().getName() + " is incrementing " + val);
        for (int i = 0; i < 1_000_000; i++) {
            val++;
        }
    }
}