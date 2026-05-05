import java.util.concurrent.CountDownLatch;

public class ThreadCountdownExmapls {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is working");
            try { Thread.sleep(1000); } catch (Exception e) {}
            System.out.println(Thread.currentThread().getName() + " done");
            latch.countDown();
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        System.out.println("Main thread waiting...");
        latch.await(); // Wait until count = 0

        System.out.println("All tasks completed. Main thread resumes.");
    }
}
