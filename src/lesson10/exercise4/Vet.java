package lesson10.exercise4;

public class Vet {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal);
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("творог, молоко", "в помещении", "cкоттиш-страйт", "короткая", "средний");
        animals[1] = new Dog("кости и мясо", "в квартире(в холодное время года)/на улице(в тёпло время года)", "джек рассел терьер", 7.2);
        animals[2] = new Horse("морковь, овёс", "в конюшне/загоне", "фрейбергер", 450.4);
        for (Animal animal : animals) {
            Vet.treatAnimal(animal);
        }
    }
}
