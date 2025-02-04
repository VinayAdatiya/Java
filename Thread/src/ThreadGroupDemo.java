public class ThreadGroupDemo extends Thread {
    @Override
    public void run() {
        System.out.println("From " + Thread.currentThread().getName() + " From Group " + Thread.currentThread().getThreadGroup().getName());
    }

    public static void main(String[] args) {
        ThreadGroup group1 = new ThreadGroup("Group1");

        ThreadGroupDemo thread1 = new ThreadGroupDemo();
        ThreadGroupDemo thread2 = new ThreadGroupDemo();

        thread1.start();
        thread2.start();

        new Thread(group1, new Runnable() {
            @Override
            public void run() {
                System.out.println("From " + Thread.currentThread().getName() + " From Group " + Thread.currentThread().getThreadGroup().getName());
            }
        }).start();
    }
}
