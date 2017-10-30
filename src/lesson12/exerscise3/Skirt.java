package lesson12.exerscise3;

public class Skirt extends Clothes implements WomensClothing {
    public Skirt(String size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void getDressedWoman() {
        System.out.print("Юбка");
    }

    @Override
    public String toString() {
        return "юбку: " + super.toString();
    }
}
