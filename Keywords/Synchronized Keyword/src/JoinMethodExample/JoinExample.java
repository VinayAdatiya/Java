package JoinMethodExample;
class ThreadJoin extends Thread {
    public void run() {
        for (int j = 0; j < 2; j++) {
            try {
                // sleeping the thread for 300 milliseconds
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            }
            catch (Exception e) {
                System.out.println("The exception has been caught: " + e);
            }
            System.out.println(j);
        }
    }
}

public class JoinExample {
    public static void main(String args[]) {
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

        // thread th1 starts
        th1.start();
        try {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th1.join();
        }
        catch (Exception e) {
            System.out.println("The exception has been caught " + e);
        }

        // thread th2 starts
        th2.start();
        try {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th2.join();
        }
        catch (Exception e) {
            System.out.println("The exception has been caught " + e);
        }

        // thread th3 starts
        th3.start();
    }
}
