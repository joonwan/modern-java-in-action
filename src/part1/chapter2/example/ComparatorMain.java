package part1.chapter2.example;

import part1.chapter2.Apple;
import part1.chapter2.Color;

import java.util.ArrayList;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {
        List<Apple> apples = getApples();

        // 무게기준 오름차순 정렬
//        apples.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
        // 무게기준 내림차순 정렬
        apples.sort((a1, a2) -> a2.getWeight() - a1.getWeight());

        System.out.println(apples);
    }

    private static List<Apple> getApples() {
        Apple apple1 = new Apple(Color.RED, 150);
        Apple apple2 = new Apple(Color.GREEN, 140);
        Apple apple3 = new Apple(Color.RED, 120);
        Apple apple4 = new Apple(Color.GREEN, 130);
        Apple apple5 = new Apple(Color.RED, 100);

        return new ArrayList<>(List.of(apple1, apple2, apple3, apple4, apple5));
    }
}
