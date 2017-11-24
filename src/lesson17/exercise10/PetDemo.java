package lesson17.exercise10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("Барсик", new Cat("Барсик", "cкоттиш-страйт"));
        pets.put("Кеша", new Parrot("Кеша", "жако"));
        pets.put("Шарик", new Dog("Шарик", "джек рассел терьер"));

        iterateKeys(pets);

        System.out.println(pets.get("Кеша"));
    }

    public static void iterateKeys(Map<String, Pet> pets) {
        Set<String> keys = pets.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
