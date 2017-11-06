package lesson12.exerscise2;

public class TShirt extends Clothes implements WomensClothing, MensClothing {
    public TShirt(ClothingSize size, double price, String color) {
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
