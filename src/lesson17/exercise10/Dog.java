package lesson17.exercise10;

public class Dog extends Pet {
    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String toString() {
        return "Собака: " + super.toString();
    }
}
