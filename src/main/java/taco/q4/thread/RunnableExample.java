package taco.q4.thread;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + " Thread is running..." + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableExample();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
