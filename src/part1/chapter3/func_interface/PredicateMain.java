package part1.chapter3.func_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {

    public static void main(String[] args) {

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> stringList = getStringList();

        List<String> result = filter(stringList, nonEmptyStringPredicate);
        System.out.println(result);

    }

    private static List<Integer> getIntegerList() {
        return List.of(1,2,3,4);
    }

    private static List<String> getStringList() {
        return List.of("", "hello", "", "world");
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List result = new ArrayList<>();

        for (T t : list) {
            if (p.test(t)) result.add(t);
        }

        return result;
    }
}
