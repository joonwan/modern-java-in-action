package part1.chapter2.strategy;

import part1.chapter2.Apple;
import part1.chapter2.Color;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.RED)
                && apple.getWeight() > 150;
    }
}
