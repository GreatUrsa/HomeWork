package lesson17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
 * Избавиться от повторяющихся элементов в строке и вывести результат на экран.
 */
public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел через пробел (Пример: 1 2 3 4 4 5):");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }
}

