package part1.chapter3;

import java.util.ArrayList;
import java.util.Random;

public class LambdaExample1 {

    public static void main(String[] args) {
        ArrayList<Apple> inventory = getInventory(10);

        System.out.println("===== 정렬 전 =====");
        System.out.println(inventory);

        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        System.out.println("===== 정렬 후 =====");
        System.out.println(inventory);
    }

    private static ArrayList<Apple> getInventory(int size) {
        ArrayList<Apple> inventory = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            inventory.add(new Apple(random.nextInt(size)));
        }

        return inventory;
    }

    static class Apple {
        private Integer weight;

        public Apple(Integer weight) {
            this.weight = weight;
        }

        public Integer getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "[ " + weight + " ]";
        }
    }
}
