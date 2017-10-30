package lesson12.exerscise3;

public class TShirt extends Clothes implements WomensClothing, MensClothing {
    public TShirt(String size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void getDressedWoman() {
        System.out.println("Футболка");
    }

    @Override
    public void getDressedMan() {
        System.out.println("Футболка");
    }

    @Override
    public String toString() {
        return "футболку: " + super.toString();
    }
}
