class Counter{
    private int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void  setCount() {
        System.out.println("Thread Name :- "+Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            this.count = getCount()+1;
        }
        System.out.println(count);
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> c.setCount());
        Thread t2 = new Thread(() -> c.setCount());
        t1.start();
        t2.start();
        t1.join(); // Without throws, it sends interruptedException //Join() waits for current thread to terminate
        t2.join();
        System.out.println("Count :- "+c.getCount());
    }
}
