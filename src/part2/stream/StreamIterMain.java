package part2.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIterMain {

    public static void main(String[] args) {
        List<String> title = Arrays.asList("Java8", "In", "Action");

        Stream<String> stream = title.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
