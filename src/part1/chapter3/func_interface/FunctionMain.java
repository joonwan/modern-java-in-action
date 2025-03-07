package part1.chapter3.func_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {

    public static void main(String[] args) {
        List<Number> numberList = getNumberList();
        List<String> map = map(numberList, (number) -> number.toString());
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        ArrayList<R> result = new ArrayList<>();

        for (T t : list) result.add(f.apply(t));

        return result;
    }

    private static List<Number> getNumberList() {
        return List.of(new Number(1), new Number(2), new Number(3));
    }

    static class Number {

        private int n;

        public Number(int n) {
            this.n = n;
        }

        @Override
        public String toString() {
            return "[ "+ n + " ]";
        }
    }
}
