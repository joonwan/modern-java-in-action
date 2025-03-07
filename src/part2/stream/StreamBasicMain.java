package part2.stream;

import part2.common.Dish;
import part2.common.MenuCreator;

import java.util.List;

import static java.util.stream.Collectors.*;

public class StreamBasicMain {

    public static void main(String[] args) {
        List<Dish> menu = MenuCreator.createMenu();

        List<String> threeHighCaloricDishNames =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .map(Dish::getName)
                        .limit(3)
                        .collect(toList());

        System.out.println("threeHighCaloricDishNames = " + threeHighCaloricDishNames);
    }
}
