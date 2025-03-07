package part1.chapter3.lambda_method_reference;

public class Apple {

    private Integer weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
