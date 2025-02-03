public class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World\nIt's a basic example using runnable interface");
    }

    public static void main(String[] args) {
        new Thread(new RunnableExample()).start();
        new Thread(new RunnableExample()).start();
    }
}
