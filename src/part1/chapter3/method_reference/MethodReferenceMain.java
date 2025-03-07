package part1.chapter3.method_reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceMain {

    public static void main(String[] args) {

        // static method reference
        Function<String, Integer> f1 = Integer::parseInt;
        Integer staticResult = f1.apply("10");
        System.out.println("staticResult = " + staticResult + " class = " + staticResult.getClass());

        // 기존 객체 인스턴스 메서드 참조
        Number number = new Number(30);
        Supplier<String> s1 = number::toString;
        String objectResult = s1.get();
        System.out.println("objectResult = " + objectResult + " class = " + objectResult.getClass());

        // instance method 참조
        Number number2 = new Number(50);
        Function<Number, String> f2 = Number::toString;
        String instanceResult = f2.apply(number2);
        System.out.println("instanceResult = " + instanceResult + " class = " + objectResult.getClass());
    }


    static class Number {
        int n;

        public Number(int n) {
            this.n = n;
        }

        @Override
        public String toString() {
            return "Number{" +
                    "n=" + n +
                    '}';
        }
    }
}
