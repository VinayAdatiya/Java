
import java.util.stream.IntStream;

public class MultithreadingDemo6 extends Thread {
    boolean flag = false;

    synchronized void m1() throws InterruptedException {
        System.out.println("in synchronized m1() method: " + this.getName());
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("-> " + i);
            if (i == 5) m2();
        }
    }

    synchronized void m2() throws InterruptedException {
        System.out.println("in m2() method: " + this.getName());
        if (!flag) {
            System.out.println("Thread waiting...");
            flag = true;
            wait(); // Ensuring it is inside a synchronized method
        } else {
            System.out.println("Thread notifying...");
            notify();
        }
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultithreadingDemo5 thread1 = new MultithreadingDemo5();
        MultithreadingDemo5 thread2 = new MultithreadingDemo5();

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}