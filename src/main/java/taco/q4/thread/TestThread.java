package taco.q4.thread;

public class TestThread extends Thread{
    public void run() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (true) {
            System.out.println(this.getName() + ": New Thread is running..." + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new TestThread();
        t1.setName("Thread-1");
        t1.start();
        Thread t2 = new TestThread();
        t2.setName("Thread-2");
        t2.start();
    }
}
