package part1.chapter2.example;

import java.util.concurrent.*;

public class CallableMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor es =(ThreadPoolExecutor) Executors.newCachedThreadPool();

        long startTime = System.currentTimeMillis();

        Future<String> future1 = es.submit(new MyCallable());
        Future<String> future2 = es.submit(new MyCallable());
        Future<String> future3 = es.submit(new MyCallable());
        Future<String> future4 = es.submit(new MyCallable());

        String name1 = future1.get();
        String name2 = future2.get();
        String name3 = future3.get();
        String name4 = future4.get();

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);
        System.out.println("name4 = " + name4);

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + (endTime - startTime) + "ms");
        es.shutdown();

    }

    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return Thread.currentThread().getName();
        }
    }
}
