package part1.chapter3.lambda_method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * 익명 클래스 사용
 */

public class LambdaMethodRefMainV1 {

    public static void main(String[] args) {

        ArrayList<Apple> appleList = getAppleList(5);
        System.out.println("정렬 전");
        System.out.println(appleList);


        appleList.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

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
