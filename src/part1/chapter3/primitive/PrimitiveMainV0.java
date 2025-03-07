package part1.chapter3.primitive;

import java.util.function.Predicate;

public class PrimitiveMainV0 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Predicate<Integer> p = (Integer i) -> i > 5;
        System.out.println(p.test(3));
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + (endTime - startTime) + "ms");

    }

}
