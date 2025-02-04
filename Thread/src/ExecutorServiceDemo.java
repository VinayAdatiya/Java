import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("==================||  newFixedThreadPool ||======================");
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        service.execute(() -> System.out.println(Thread.currentThread().getName() + " "));

        Future<Integer> future1 = service.submit(() -> 10);
        Future<Integer> future2 = service.submit(() -> 20);
        System.out.println(future1.get() + " "+future1.resultNow());
        System.out.println(future2.get());

        service.shutdown();
        System.out.println("==================||  newCachedThreadPool ||======================");
        ExecutorService service1 = Executors.newCachedThreadPool();

        service1.execute(() -> System.out.println(Thread.currentThread().getName() + " "));
        service1.execute(() -> System.out.println(Thread.currentThread().getName() + " "));
        service1.execute(() -> System.out.println(Thread.currentThread().getName() + " "));
        service1.execute(() -> System.out.println(Thread.currentThread().getName() + " "));
        service1.execute(() -> System.out.println(Thread.currentThread().getName() + " "));


        service1.shutdown();
    }
}
