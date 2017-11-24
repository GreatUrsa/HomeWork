package lesson17;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать динамический массив, содержащий объекты класса HeavyBox.
 * Раcпечатать его содержимое используя for each.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox());
        boxes.add(new HeavyBox(10, 20, 30, 40));
        boxes.add(new HeavyBox(15, 25, 35, 45));

        for (HeavyBox heavyBox : boxes) {
            System.out.println(heavyBox);
        }
    }
}
