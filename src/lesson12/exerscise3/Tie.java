package lesson12.exerscise3;

public class Tie extends Clothes implements MensClothing {
    public Tie(String size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void getDressedMan() {
        System.out.println("Галстук");
    }

    @Override
    public String toString() {
        return "галстук: " + super.toString();
    }
}
