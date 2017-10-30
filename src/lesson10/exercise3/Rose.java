package lesson10.exercise3;

public class Rose extends Flower {
    public Rose(String manufacturer, int shelfLife) {
        super(manufacturer, shelfLife);
    }

    @Override
    public int price() {
        return 15;
    }
}
