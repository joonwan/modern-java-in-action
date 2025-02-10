package part1.chapter2;

import java.util.ArrayList;
import java.util.List;

import static part1.chapter2.Color.GREEN;
import static part1.chapter2.Color.RED;

public class FilterMainV2 {

    public static void main(String[] args) {
        List<Apple> inventory = getInventory();

        List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
        System.out.println("greenApples = " + greenApples);

        List<Apple> redApples = filterApplesByColor(inventory, RED);
        System.out.println("redApples = " + redApples);
    }

    private static List<Apple> getInventory() {

        Apple apple1 = new Apple(GREEN, 100);
        Apple apple2 = new Apple(RED, 120);
        Apple apple3 = new Apple(GREEN, 150);
        Apple apple4 = new Apple(GREEN, 140);
        Apple apple5 = new Apple(RED, 160);

        return List.of(apple1, apple2, apple3, apple4, apple5);
    }

    private static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }
}
