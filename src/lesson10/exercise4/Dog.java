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
}
