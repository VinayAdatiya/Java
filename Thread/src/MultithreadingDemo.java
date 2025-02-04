package multithreading;

import java.util.stream.IntStream;

class Thread1 extends Thread {
    @Override
    public void run() {
        IntStream.range(1, 40).forEach(s -> System.out.println(this.getName() + " " + s));
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        thread1.setName("th1");
        thread1.sleep(1000);

        Thread1 thread2 = new Thread1();
        thread2.setName("th2");

        thread1.start();
        thread2.start();
    }
}