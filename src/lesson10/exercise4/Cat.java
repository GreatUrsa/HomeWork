package lesson10.exercise4;

public class Cat extends Animal {
    private String breed;
    private String typeOfWool;
    private String size;

    public Cat(String food, String location, String breed, String typeOfWool, String size) {
        super(food, location);
        this.breed = breed;
        this.typeOfWool = typeOfWool;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTypeOfWool() {
        return typeOfWool;
    }

    public void setTypeOfWool(String typeOfWool) {
        this.typeOfWool = typeOfWool;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void makeNoise() {
        System.out.println("мяукает");
    }

    @Override
    public void eat() {
        System.out.println(getFood());
    }
}
