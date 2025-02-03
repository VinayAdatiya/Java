public class ThreadPriorityExample extends Thread{
    public void run() {
        System.out.println("Thread Name :- "+Thread.currentThread().getName()+" Priority :- "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriorityExample t1 = new ThreadPriorityExample();
        ThreadPriorityExample t2 = new ThreadPriorityExample();
        ThreadPriorityExample t3 = new ThreadPriorityExample();
        ThreadPriorityExample t4 = new ThreadPriorityExample();
        t1.setPriority(4);
        t2.setPriority(2);
        t3.setPriority(1);
        t4.setPriority(3);
        t1.start();
//        t1.start(); Error :- Exception in thread "main" java.lang.IllegalThreadStateException
        t2.start();
        t3.start();
        t4.start();
    }
}
