package lesson17.exercise2;

import java.util.SortedSet;
import java.util.TreeSet;

public class BoxTreeSet {
    public static void main(String[] args) {
        SortedSet<HeavyBox> boxes = new TreeSet<>();
        boxes.add(new HeavyBox(10, 20, 30, 40));
        boxes.add(new HeavyBox(15, 25, 35, 45));
        boxes.add(new HeavyBox(20, 30, 40, 50));
        for (HeavyBox heavyBox : boxes) {
            System.out.println(heavyBox);
        }
    }
}
