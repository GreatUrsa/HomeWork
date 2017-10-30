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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horse horse = (Horse) o;

        if (Double.compare(horse.weight, weight) != 0) return false;
        return type != null ? type.equals(horse.type) : horse.type == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Лошадь: " +
                "тип - " + type +
                ", вес - " + weight +
                " кг." + super.toString();
    }
}
