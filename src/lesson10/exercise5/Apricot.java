package lesson10.exercise5;

public class Apricot extends Fruit {
    static final int APRICOTPRICE = 25;

    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double price() {
        return getWeight() * APRICOTPRICE;
    }
}
