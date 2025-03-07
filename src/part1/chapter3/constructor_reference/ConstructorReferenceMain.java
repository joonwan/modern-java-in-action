package part1.chapter3.constructor_reference;

import part1.chapter2.Color;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceMain {

    public static void main(String[] args) {
        Supplier<Apple> r1 = Apple::new;
        Function<Integer, Apple> r2 = Apple::new;
        BiFunction<Integer, Color, Apple> r3 = Apple::new;

        Apple apple1 = r1.get();
        Apple apple2 = r2.apply(150);
        Apple apple3 = r3.apply(200, Color.GREEN);

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);
    }



    static class Apple {
        int weight;
        Color color;

        public Apple() {
            weight = 100;
            color = Color.RED;
        }

        public Apple(int weight) {
            this.weight = weight;
            this.color = Color.GREEN;
        }

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
