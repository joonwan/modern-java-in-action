package part1.chapter2;

import java.util.ArrayList;
import java.util.List;

import static part1.chapter2.Color.GREEN;
import static part1.chapter2.Color.RED;

public class SortMain {

    public static void main(String[] args) {
        List<Apple> inventory = getInventory();

        inventory.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
        System.out.println("ascInventory = " + inventory);

        inventory.sort((a1, a2) -> a2.getWeight() - a1.getWeight());
        System.out.println("descInventory = " + inventory);
    }

    private static List<Apple> getInventory() {

        Apple apple1 = new Apple(GREEN, 100);
        Apple apple2 = new Apple(RED, 120);
        Apple apple3 = new Apple(GREEN, 150);
        Apple apple4 = new Apple(GREEN, 140);
        Apple apple5 = new Apple(RED, 160);

        return new ArrayList<>(List.of(apple1, apple2, apple3, apple4, apple5));
    }
}
