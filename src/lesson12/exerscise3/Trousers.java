package lesson12.exerscise3;

public class Trousers extends Clothes implements MensClothing, WomensClothing {
    public Trousers(String size, double price, String color) {
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
