package part1.chapter2;

import java.util.ArrayList;
import java.util.List;

import static part1.chapter2.Color.*;

public class FilterMainV1 {

    public static void main(String[] args) {
        List<Apple> inventory = getInventory();

        List<Apple> greenApples = filterGreenApples(inventory);
        System.out.println("greenApples = " + greenApples);

        List<Apple> redApples = filterRedApple(inventory);
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

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterRedApple(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (RED.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
