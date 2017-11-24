package lesson17.exercise10;

public class Parrot extends Pet {
    public Parrot(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String toString() {
        return "Попугай: " + super.toString();
    }
}
