package part1.chapter3.lambda_method_reference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 * 람다 사용
 */
public class LambdaMethodRefMainV2 {

    public static void main(String[] args) {

        ArrayList<Apple> appleList = getAppleList(5);
        System.out.println("정렬 전");
        System.out.println(appleList);

        appleList.sort(Comparator.comparing((Apple a1) -> a1.getWeight()));

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
