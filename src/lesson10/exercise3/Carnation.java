package lesson10.exercise3;

public class Carnation extends Flower {
    public Carnation(String manufacturer, int shelfLife) {
        super(manufacturer, shelfLife);
    }

    @Override
    public int price() {
        return 5;
    }
}
