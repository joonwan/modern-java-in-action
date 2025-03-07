package part2.filter_and_sort;

import part2.common.Dish;
import part2.common.MenuCreator;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterSortMainV2 {

    public static void main(String[] args) {
        List<Dish> menu = MenuCreator.createMenu();

        List<String> lowCaloricDishesName = menu.parallelStream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

        System.out.println("lowCaloricDishesName = " + lowCaloricDishesName);
    }
}
