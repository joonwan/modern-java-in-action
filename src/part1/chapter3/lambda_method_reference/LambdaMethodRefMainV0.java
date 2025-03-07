package part1.chapter3.lambda_method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * Comparator 구현체 생성
 */

public class LambdaMethodRefMainV0 {

    public static void main(String[] args) {

        ArrayList<Apple> appleList = getAppleList(5);
        System.out.println("정렬 전");
        System.out.println(appleList);

        AppleComparator comparator = new AppleComparator();
        appleList.sort(comparator);

        System.out.println("정렬 후");
        System.out.println(appleList);
    }

    private static ArrayList<Apple> getAppleList(int size) {
        Random random = new Random();

        ArrayList<Apple> result = new ArrayList<>();

        for (int i =0 ; i < size; i++) {
            result.add(new Apple(random.nextInt(40)));
        }

        return result;
    }
}

class AppleComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}