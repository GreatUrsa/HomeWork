package lesson17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Toy).
 * Перебрать и распечатать пары значений - entrySet().
 * Перебрать и распечатать набор из имен игрушек  - keySet().
 * Перебрать и распечатать значения игрушек - values().
 * Для каждого перебора создать свой метод.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 25));
        map.put("Box", new Toy("Box", 45));
        map.put("Car", new Toy("Car", 56));
        System.out.println();

        iterateEntries(map);
        System.out.println();

        iterateKeys(map);
        System.out.println();

        iterateValues(map);
    }

    private static void iterateValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy value : values) {
            System.out.println(value);
        }
    }

    private static void iterateKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    private static void iterateEntries(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> entries = map.entrySet();
        for (Map.Entry<String, Toy> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
