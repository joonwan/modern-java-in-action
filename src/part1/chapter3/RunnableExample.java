package part1.chapter3;

public class RunnableExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("main thread 시작: " + Thread.currentThread().getName());

        Runnable r1 = () -> System.out.println("r1: " + Thread.currentThread().getName());
        Runnable r2 = () -> System.out.println("r2: " + Thread.currentThread().getName());

        Thread t1 = new Thread(r1, "my-thread-1");
        Thread t2 = new Thread(r2, "my-thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("main thread 종료");
    }
}
