package part1.chapter3.func_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {
        ArrayList<Integer> integerList = getIntegerList();
        forEach(integerList, (i) -> System.out.println(i));
    }

    private static ArrayList<Integer> getIntegerList() {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 5; i++) result.add(i);

        return result;
    }

    private static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) c.accept(t);
    }
}
