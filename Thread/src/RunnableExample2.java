import java.util.Random;

class RunnableInterface implements Runnable {

    // create a shared Object for storing result   
    private Object result = null;

    @Override
    public void run() {
        Random obj = new Random();
        Integer number = obj.nextInt(10);

        try {
            Thread.sleep(number * 10);
        }catch(InterruptedException exception) {
            exception.printStackTrace();
        }
        result = number;
        System.out.println("Thread Name :- "+Thread.currentThread().getName()+" Assigned Number :- "+result);
        // wake up threads blocked on the get() method    
        synchronized(this) {
            notify();
        }
    }

    // get() method for returning the result   
    public synchronized Object get() throws InterruptedException{

        while(result == null) {
            wait();
        }
        return result;
    }
}

//create RunnableExample class   
public class RunnableExample2 {

    //main() method start   
    public static void main(String args[]) throws InterruptedException {

        //create an array of RunnableInterface   
        RunnableInterface[] tasks = new RunnableInterface[5];

        //use for loop   
        for(int i = 0; i < 5; i++) {
            //create an instance of RunnableInterface   
            tasks[i] = new RunnableInterface();

            // create a Thread with RunnableInterface   
            Thread thread = new Thread(tasks[i]);

            thread.start();
        }

        //use for loop for printing returned value of each Runnable   
        for(int j = 0; j < 5; j++) {
            // use get() method to print the returned value   
            System.out.println("Runnable["+j+"] ===> "+tasks[j].get());
        }
    }
}  