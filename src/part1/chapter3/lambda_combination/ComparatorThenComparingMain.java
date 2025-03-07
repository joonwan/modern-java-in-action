package part1.chapter3.lambda_combination;

import part1.chapter3.lambda_method_reference.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ComparatorThenComparingMain {

    public static void main(String[] args) {
        ArrayList<Apple> appleList = getAppleList();
        System.out.println("정렬 전");
        System.out.println(appleList);

        appleList.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getCountry));

        System.out.println("정렬 후");
        System.out.println(appleList);
    }

    private static ArrayList<Apple> getAppleList() {
        ArrayList<Apple> result = new ArrayList<>();

        result.add(new Apple(10, "kor"));
        result.add(new Apple(10, "eng"));
        result.add(new Apple(7, "jap"));
        result.add(new Apple(2, "jap"));

        return result;
    }

    static class Apple {
        int weight;
        String country;

        public Apple(int weight, String country) {
            this.weight = weight;
            this.country = country;
        }

        public int getWeight() {
            return weight;
        }

        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", country='" + country + '\'' +
                    '}';
        }
    }
}
