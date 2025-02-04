class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread in " + getState() + " state (RUNNABLE)");

            // Sleeping for a while to enter TIMED_WAITING state
            Thread.sleep(2000);
            System.out.println("Thread in " + getState() + " state (TIMED_WAITING)");

            synchronized (this) {
                System.out.println("Thread in " + getState() + " state (WAITING run)");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        // NEW state (before start)
        System.out.println("Thread in " + myThread.getState() + " state (NEW)");

        myThread.start();

        // Give time for the thread to transition to RUNNABLE
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread in " + myThread.getState() + " state (RUNNABLE or TIMED_WAITING)");

        synchronized (myThread) {
            // Ensuring the thread is waiting before notifying
            try {
                Thread.sleep(9500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myThread.notify();
            try {
                Thread.sleep(9500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread in " + myThread.getState() + " state (WAITING main) " + myThread.getName());

            // Waking up the thread
        }

        // Ensure the thread has completed execution
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TERMINATED state after completion
        System.out.println("Thread in " + myThread.getState() + " state (TERMINATED)");
    }
}
