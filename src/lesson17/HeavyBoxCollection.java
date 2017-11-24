package lesson17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создать коллекцию, содержащую объекты HeavyBox. Написать метод, который перебирает элементы коллекции
 * и проверяет вес коробок. Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
 */
public class HeavyBoxCollection {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10, 20, 30, 150));
        boxes.add(new HeavyBox(15, 25, 35, 450));
        boxes.add(new HeavyBox(26, 33, 35, 320));
        boxes.add(new HeavyBox(18, 23, 34, 45));
        System.out.println(getLightBox(boxes));
        System.out.println(boxes);

    }

    public static List<HeavyBox> getLightBox(List<HeavyBox> boxes) {
        List<HeavyBox> newBoxes = new ArrayList<>();
        Iterator<HeavyBox> iterator = boxes.iterator();
        while (iterator.hasNext()) {
            HeavyBox element = iterator.next();
            if (element.getWeight() > 300) {
                iterator.remove();
                newBoxes.add(element);
            }
        }
        return newBoxes;
    }
}
