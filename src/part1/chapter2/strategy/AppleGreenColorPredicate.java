package part1.chapter2.strategy;

import part1.chapter2.Apple;

import static part1.chapter2.Color.*;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(GREEN);
    }
}
