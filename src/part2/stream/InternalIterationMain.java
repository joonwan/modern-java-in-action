package part2.stream;

import part2.common.Dish;
import part2.common.MenuCreator;

import java.util.List;
import java.util.stream.Collectors;

public class InternalIterationMain {
    public static void main(String[] args) {
        List<Dish> menu = MenuCreator.createMenu();
        List<String> names = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println("names = " + names);
    }
}
