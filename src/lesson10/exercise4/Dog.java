package lesson10.exercise4;

public class Dog extends Animal {
    private String breed;
    private double weight;

    public Dog(String food, String location, String breed, double weight) {
        super(food, location);
        this.breed = breed;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("лает");
    }

    @Override
    public void eat() {
        System.out.println(getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (Double.compare(dog.weight, weight) != 0) return false;
        return breed != null ? breed.equals(dog.breed) : dog.breed == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = breed != null ? breed.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Собака: " +
                "порода - " + breed +
                ", вес - " + weight + " кг." + super.toString();
    }
}
