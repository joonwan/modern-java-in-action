package part1.chapter2;

import part1.chapter2.strategy.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

import static part1.chapter2.Color.GREEN;
import static part1.chapter2.Color.RED;

public class FilterMainV5 {

    public static void main(String[] args) {
        List<Apple> inventory = getInventory();

        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals(RED);
            }
        });

        System.out.println(redApples);
    }

    private static List<Apple> getInventory() {

        Apple apple1 = new Apple(GREEN, 100);
        Apple apple2 = new Apple(RED, 120);
        Apple apple3 = new Apple(GREEN, 160);
        Apple apple4 = new Apple(GREEN, 140);
        Apple apple5 = new Apple(RED, 160);

        return List.of(apple1, apple2, apple3, apple4, apple5);
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
