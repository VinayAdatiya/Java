

import java.util.stream.IntStream;

public class MultithreadingDemo5 extends Thread{
    boolean flag = false;
    synchronized void m1() throws InterruptedException {
        for(int i=0;i<10;i++){
            System.out.println(this.getName() +" -> " + i);
            if(i==5) m2();
            //if(i==5) wait();
        }
    }

    synchronized void m2() throws InterruptedException {
        System.out.println("in m2() method");
        if(!flag){
            System.out.println("in flag by " + this.getName());
            flag = true;
            wait();
        } else {
            notify();
        }
    }

    @Override
    public void run() {
        try {
            this.m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> {
            System.out.println("In Runnable run method " + Thread.currentThread().getName());
            IntStream.range(1, 51).boxed().forEach(integer -> System.out.print(integer + " "));
        };

        Runnable runnable2 = () -> {
            System.out.println("In Runnable run method " + Thread.currentThread().getName());
            IntStream.range(51, 100).boxed().forEach(integer -> System.out.print(integer + " "));
        };

        /*
        Thread myThread1 = new Thread(runnable1);
        Thread myThread2 = new Thread(runnable2);

        myThread1.start();
        myThread2.start();
        */

        MultithreadingDemo5 thread1 = new MultithreadingDemo5();
        MultithreadingDemo5 thread2 = new MultithreadingDemo5();

        thread1.start();
        thread2.start();
    }
}
