package part1.chapter3.capturing_lambda;

public class CapturingLambdaMain {

    private static int staticNumber;

    public static void main(String[] args) {

        int localNumber = 0;


        staticNumber++;
        localNumber++;

        Runnable staticRun = () -> System.out.println(staticNumber);
        // Runnable localRun = () -> System.out.println(localNumber);

        staticRun.run();
        //localRun.run();



    }

}
