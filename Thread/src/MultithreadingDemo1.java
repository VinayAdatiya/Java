
public class MultithreadingDemo1 extends Thread{
    static int priorityCounter = 6;
    @Override
    public void run() {
        System.out.println("In Run Method called by thread " + Thread.currentThread().getName());
    }

    @Override
    public void start() {
        Thread.currentThread().setPriority(priorityCounter++);
        System.out.println("In Start Method " + this.getName() + " with priority " + priorityCounter);
        super.start();
    }

    public static void main(String[] args) {
        System.out.println("Start of Main Method");
        MultithreadingDemo1 thread1 = new MultithreadingDemo1();
        MultithreadingDemo1 thread2 = new MultithreadingDemo1();

        thread1.start();
        thread2.start();

        System.out.println("End of Main Thread");
    }
}
