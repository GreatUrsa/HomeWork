package lesson12.exerscise2;

public class Trousers extends Clothes implements MensClothing, WomensClothing {
    public Trousers(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void getDressedMan() {
        System.out.println("Брюки");
    }

    @Override
    public void getDressedWoman() {
        System.out.println("Брюки");
    }

    @Override
    public String toString() {
        return "брюки: " + super.toString();
    }
}
