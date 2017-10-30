package lesson10.exercise5;

public class Apricot extends Fruit {
    public static final int APRICOT_PRICE = 25;

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double price() {
        return getWeight() * APRICOT_PRICE;
    }
}
