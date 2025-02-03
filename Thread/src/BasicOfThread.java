import java.util.ArrayList;
import java.util.List;

public class BasicOfThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World !\nIt's a basic example of thread using a thread class!!!");
    }

    public static void main(String[] args) throws InterruptedException {
        BasicOfThread t1 = new BasicOfThread();
        BasicOfThread t2 = new BasicOfThread();
        t1.start();
        t2.start();

        // Sleep :- causes the current thread to suspend execution for a specified period.
        // It comes up with InterruptedException(must need to handle)
        List<String> paragraph = new ArrayList<String>();
        paragraph.add("Hello World!!");
        paragraph.add("My Name is Vinay Adatiya");
        paragraph.add("BTech in Artificial Intelligence and Data Science");
        paragraph.add("from SCET, Surat");
        for (int i = 0; i < paragraph.size(); i++) {
            Thread.sleep(200);
            System.out.println(paragraph.get(i));
        }
        System.out.println("==========");
        // Interrupt :-
            // An interrupt is an indication to a thread that it should stop what it is doing and do something else.
            // It's up to the programmer to decide exactly how a thread responds to an interrupt.
            // it is very common for the thread to terminate.
        for (int i = 0; i < paragraph.size(); i++) {
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                System.out.println("Execution Interrupted !!! ");
                return;
            }

            System.out.println(paragraph.get(i));
        }
        System.out.println("==========");
        // join :- The join method allows one thread to wait for the completion of another.
    }
}
