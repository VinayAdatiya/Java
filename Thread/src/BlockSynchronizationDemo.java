public class BlockSynchronizationDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Start of Run method by " + Thread.currentThread().getName());
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Run method by " + Thread.currentThread().getName());
    }

    void m1() throws InterruptedException {
        System.out.println("Start of m1() method by " + Thread.currentThread().getName());
        synchronized(this){
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(this.getName() + " " + i);
            }
        }
        System.out.println("Start of m1() method by " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Start of Main Method");
        BlockSynchronizationDemo thread1 = new BlockSynchronizationDemo();
        BlockSynchronizationDemo thread2 = new BlockSynchronizationDemo();

        thread1.start();
        thread2.start();
        System.out.println("End of Main Method");
    }
}
