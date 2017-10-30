package lesson10.exercise5;

public class Pear extends Fruit {
    public static final int PEAR_PRICE = 34;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double price() {
        return getWeight() * PEAR_PRICE;
    }
}
