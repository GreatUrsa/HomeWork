package lesson12.exerscise2;

public class Tie extends Clothes implements MensClothing {
    public Tie(ClothingSize size, double price, String color) {
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
