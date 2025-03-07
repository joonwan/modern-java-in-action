package part2.stream;

import part2.common.Dish;
import part2.common.MenuCreator;

import java.util.List;
import java.util.stream.Collectors;

public class LazyMain {

    public static void main(String[] args) {
        List<Dish> menu = MenuCreator.createMenu();

        System.out.println("초기 dish 들");
        menu.stream().forEach(System.out::println);
        System.out.println("연산 시작");

        List<String> names = menu.stream()
                .filter(dish -> {
                    System.out.println("filtering: " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping: " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
