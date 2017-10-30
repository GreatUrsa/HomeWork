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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (getBreed() != null ? !getBreed().equals(cat.getBreed()) : cat.getBreed() != null) return false;
        if (getTypeOfWool() != null ? !getTypeOfWool().equals(cat.getTypeOfWool()) : cat.getTypeOfWool() != null)
            return false;
        return getSize() != null ? getSize().equals(cat.getSize()) : cat.getSize() == null;
    }

    @Override
    public int hashCode() {
        int result = getBreed() != null ? getBreed().hashCode() : 0;
        result = 31 * result + (getTypeOfWool() != null ? getTypeOfWool().hashCode() : 0);
        result = 31 * result + (getSize() != null ? getSize().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Кошка: " +
                "порода - " + breed +
                ", тип шерсти - " + typeOfWool +
                ", размер - " + size + "." + super.toString();
    }
}
