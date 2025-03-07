package part1.chapter3.lambda_combination;

import part1.chapter2.Color;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateCombiMain {

    public static void main(String[] args) {

        ArrayList<Apple> apples = getApples();

        // 빨간 색
        System.out.println("빨간 사과");
        Predicate<Apple> redApple = (a) -> a.color.equals(Color.RED);
        printFilteredList(apples, redApple);

        // 빨간색 아님
        System.out.println("안빨간 사과");
        Predicate<Apple> notRedApple = redApple.negate();
        printFilteredList(apples, notRedApple);

        // 빨갛고 무게가 150 이상인 사과
        System.out.println("빨갛고 무게가 150 이상인 사과");
        Predicate<Apple> redAndHeavy = redApple.and(a -> a.weight >= 150);
        printFilteredList(apples, redAndHeavy);

        //빨갛고 150 이상인 사과 또는 그냥 초록 사과
        System.out.println("빨갛고 150 이상인 사과 또는 그냥 초록 사과");
        Predicate<Apple> readAndHeavyOrJustGreen = redAndHeavy.or(a -> a.color.equals(Color.GREEN));
        printFilteredList(apples, readAndHeavyOrJustGreen);

    }

    private static <T> void printFilteredList(ArrayList<T> list, Predicate<T> p) {
        for (T t : list) {
            if(p.test(t)) {
                System.out.println(t);
            }
        }
    }

    private static ArrayList<Apple> getApples() {
        ArrayList<Apple> result = new ArrayList<>();

        result.add(new Apple(100, Color.RED));
        result.add(new Apple(120, Color.GREEN));
        result.add(new Apple(190, Color.RED));
        result.add(new Apple(160, Color.GREEN));
        result.add(new Apple(150, Color.RED));

        return result;
    }


    static class Apple {
        int weight;
        Color color;

        public Apple(int weight, Color color) {
            this.weight = weight;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color=" + color +
                    '}';
        }
    }
}
