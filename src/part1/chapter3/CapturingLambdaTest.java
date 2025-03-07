package part1.chapter3;

public class CapturingLambdaTest {

    public static void main(String[] args) {
        int n = 10;

        Runnable r = () -> {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " : " + System.identityHashCode(n));
        };

        Thread thread = new Thread(r, "thread - 1");
        thread.start();
        System.out.println(Thread.currentThread().getName() + " : " + System.identityHashCode(n));
    }
}
