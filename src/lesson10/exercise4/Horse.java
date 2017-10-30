package lesson10.exercise4;

public class Horse extends Animal {
    private String type;
    private double weight;

    public Horse(String food, String location, String type, double weight) {
        super(food, location);
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("ржёт");
    }

    @Override
    public void eat() {
        System.out.println(getFood());
    }
}
