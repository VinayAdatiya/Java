public class DemonThread extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName()+" is Demon Thread");
        }
        else{
            System.out.println(Thread.currentThread().getName()+" Normal Thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DemonThread t1 = new DemonThread();
        DemonThread t2 = new DemonThread();
        DemonThread t3 = new DemonThread();

        t1.setDaemon(true);
        t1.start();
        t1.join();

        t2.start();
        t2.join();
        System.out.println("Setting t2 as Demon");
        try{
            t2.setDaemon(true);
        }
        catch (Exception e){
            System.out.println("Error :- "+e.getMessage());
        }


        t3.start();
        t3.join();

    }
}
