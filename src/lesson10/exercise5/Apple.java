package lesson10.exercise5;

public class Apple extends Fruit {
    public static final int APPLE_PRICE = 26;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double price() {
        return getWeight() * APPLE_PRICE;
    }

    @Override
    public String toString() {
        return "Apple{} " + super.toString();
    }
}
