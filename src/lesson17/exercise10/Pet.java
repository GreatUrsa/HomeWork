package lesson17.exercise10;

/**
 * Cоздайте класс Pet и его наследников Cat, Dog, Parrot. Создайте отображение из домашних животных,
 * где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
 * Добавьте в отображение разных животных. Создайте метод выводящий на консоль все все ключи отображения.
 */
public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (name != null ? !name.equals(pet.name) : pet.name != null) return false;
        return breed != null ? breed.equals(pet.breed) : pet.breed == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name + ", порода - " + breed + ".";
    }
}
