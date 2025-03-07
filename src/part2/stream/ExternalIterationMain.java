package part2.stream;

import part2.common.Dish;
import part2.common.MenuCreator;

import java.util.ArrayList;
import java.util.List;

public class ExternalIterationMain {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        List<Dish> menu = MenuCreator.createMenu();

        for (Dish dish : menu) {
            names.add(dish.getName());
        }

        System.out.println("names = " + names);
    }
}
