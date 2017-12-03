package lesson17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Напишите методы union(Set<?> set1, Set<?> set2) и intersect(Set<?> set1, Set<?> set2),
 * реализующих операции объединения и пересечения двух множеств.
 * Протестируйте работу этих методах на двух предварительно заполненных множествах.
 * (Вам понадобится написать вспомогательный метод, выводящий все элементы множества в консоль).
 */
public class Exercise3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 24, 3, 4, 55));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(8, 3, 6, 1, 17, 43));
        printSet(union(set1, set2));
        printSet(intersect(set1, set2));
    }

    public static void printSet(Set<Integer> set) {
        for (int s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static Set union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> newSet = new HashSet<Integer>(a);
        newSet.addAll(b);
        return newSet;
    }

    public static Set intersect(Set<Integer> a, Set<Integer> b) {
        Set<Integer> newSet = new HashSet<Integer>(a);
        newSet.retainAll(b);
        return newSet;
    }
}
