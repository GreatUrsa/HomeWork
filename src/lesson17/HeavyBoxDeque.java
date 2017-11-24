package lesson17;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Создать очередь, содержащую объекты класса HeavyBox. Используем класс ArrayDeque.
 * Поместить объекты в очередь с помощью метода offer(). Удалить объекты методом poll().
 */
public class HeavyBoxDeque {
    public static void main(String[] args) {
        Deque<HeavyBox> boxes = new ArrayDeque<>();
        boxes.offer(new HeavyBox(10, 20, 30, 40));
        boxes.offer(new HeavyBox(15, 25, 35, 45));
        boxes.offer(new HeavyBox(20, 30, 40, 50));
        while (boxes.size() > 0) {
            System.out.println(boxes.poll() + " ");
        }
    }
}
