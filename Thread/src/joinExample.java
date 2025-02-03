public class joinExample extends Thread{
    @Override
    public void run() {
        System.out.println("Hello World !");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My Name is "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        joinExample t1 = new joinExample();
        joinExample t2 = new joinExample();
        joinExample t3 = new joinExample();
        t1.start();
        t1.join();
        t3.start();
        t3.join(100);
        t2.start();
        t2.join();


    }
}
