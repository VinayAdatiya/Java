
public class MultithreadingDemo3 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        MultithreadingDemo3 thread1 = new MultithreadingDemo3();
        MultithreadingDemo3 thread2 = new MultithreadingDemo3();

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        System.out.println("In Run Method : " + this.getName());
        //IntStream.range(1, 999).boxed().forEach(integer -> System.out.println(" " + integer));
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(" " + i + " -> " + this.getName());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



