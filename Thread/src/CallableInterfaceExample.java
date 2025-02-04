import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallableInterface implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        Thread.sleep(randomNumber*100);
        return randomNumber;
    }
}

public class CallableInterfaceExample{
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //create an array of FutureTask
        //A concrete class having implementation of both Runnable and Future is called FutureTask
        FutureTask[] returnedTask = new FutureTask[5];


        for (int i = 0; i < 5; i++) {
            Callable obj = new CallableInterface();
            returnedTask[i] = new FutureTask(obj);
            Thread t = new Thread(returnedTask[i]);
            t.start();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Callable["+i+"]=>"+returnedTask[i].get());
        }
    }
}
