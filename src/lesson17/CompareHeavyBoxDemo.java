package lesson17;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable.
 * Распечатать содержимое с помощью for each.
 */
public class CompareHeavyBoxDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> boxes = new TreeSet<>();

        boxes.add(new HeavyBox(10, 20, 30, 40));
        boxes.add(new HeavyBox(10, 20, 35, 50));
        boxes.add(new HeavyBox(15, 25, 35, 45));
        boxes.add(new HeavyBox(15, 25, 35, 35));

        for (HeavyBox heavyBox : boxes) {
            System.out.println(heavyBox);
        }
    }
}
