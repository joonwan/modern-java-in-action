package part1.chapter3.lambda_combination;

import java.util.function.Function;

public class FunctionCombiMain {

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = (i) -> i + 1;
        Function<Integer, Integer> f2 = (i) -> i * 3;

        Function<Integer, Integer> andThen = f1.andThen(f2);
        Function<Integer, Integer> compose = f1.compose(f2);

        System.out.println("andThen = " + andThen.apply(5));
        System.out.println("compose = " + compose.apply(5));

    }
}
