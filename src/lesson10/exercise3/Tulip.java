package lesson10.exercise3;

public class Tulip extends Flower {
    Tulip(String manufacturer, int shelfLife) {
        super(manufacturer, shelfLife);
    }

    @Override
    public int price() {
        return 12;
    }
}
