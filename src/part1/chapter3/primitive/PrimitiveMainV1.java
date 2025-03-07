package part1.chapter3.primitive;

import java.util.function.IntPredicate;

public class PrimitiveMainV1 {

    public static void main(String[] args) {

        IntPredicate p = (int i) -> i > 5;
        System.out.println(p.test(3));

    }

}
