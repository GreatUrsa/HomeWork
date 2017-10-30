package lesson10.exercise3;

public class Lotus extends Flower {
    public Lotus(String manufacturer, int shelfLife) {
        super(manufacturer, shelfLife);
    }

    @Override
    public int price() {
        return 30;
    }
}
