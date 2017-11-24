package lesson17.exercise10;

public class Cat extends Pet {
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public String toString() {
        return "Кошка: " + super.toString();
    }
}
