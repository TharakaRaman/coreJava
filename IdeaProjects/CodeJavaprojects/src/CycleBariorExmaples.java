import java.util.concurrent.CyclicBarrier;

public class CycleBariorExmaples {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("All threads reached barrier. Processing combined result...");
        });

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is working");
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " waiting at barrier");
                barrier.await(); // Wait for others
            } catch (Exception e) {}
            System.out.println(Thread.currentThread().getName() + " continues...");
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}

