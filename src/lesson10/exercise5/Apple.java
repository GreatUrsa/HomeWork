package lesson10.exercise5;

public class Apple extends Fruit {
    static final int APPLEPRICE = 26;

    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double price() {
        return getWeight() * APPLEPRICE;
    }
}
