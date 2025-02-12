package part1.chapter2.example;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " is running!!"));
        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " is running!!!"));
        Thread thread3 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " is running!!!!"));

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(Thread.currentThread().getName() + " thread 종료");


    }
}
