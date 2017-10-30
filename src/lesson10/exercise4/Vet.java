package lesson10.exercise4;

public class Vet {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getClass().getSimpleName() + " обитает " + animal.getLocation() + ". Предпочтительная еда - " + animal.getFood() + ".");
    }

    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("творог, молоко", "в помещении", "Скоттиш-страйт", "короткая", "средний");
        animal[1] = new Dog("кости и мясо", "в квартире(в холодное время года)/на улице(в тёпло время года)", "джек рассел терьер", 7);
        animal[2] = new Horse("морковь, овёс", "в конюшне/загоне", "фрейбергер", 450);
        for (Animal a : animal) {
            Vet.treatAnimal(a);
        }
    }
}
