package multithreading;

public class MethodSynchronizationDemo extends Thread {
    @Override
    public void run() {
        try {
            this.m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    MethodSynchronizationDemo(String threadName){
        super(threadName);
    }

    synchronized void m1() throws InterruptedException {
        for(int i=0;i<10;i++){
            System.out.println(i + " " + Thread.currentThread().getName());
            if(i==5) m2(Thread.currentThread().getName());
        }
    }

    void m2(String name) throws InterruptedException {
        Thread.currentThread().sleep(5000);
        System.out.println("in m2() by " + name);
    }

    public static void main(String[] args) throws InterruptedException {
        MethodSynchronizationDemo thread1 = new MethodSynchronizationDemo("T1");
        MethodSynchronizationDemo thread2 = new MethodSynchronizationDemo("T2");

        thread1.start();
        thread2.start();

        MethodSynchronizationDemo thread3 = new MethodSynchronizationDemo("T3");
        thread3.m2(thread3.getName());
    }
}
