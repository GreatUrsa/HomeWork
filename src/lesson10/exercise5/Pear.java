package lesson10.exercise5;

public class Pear extends Fruit {
    static final int PEARPRICE = 34;

    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double price() {
        return getWeight() * PEARPRICE;
    }
}
