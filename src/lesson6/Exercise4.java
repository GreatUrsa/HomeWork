package lesson6;

import java.util.Arrays;

/**
 * Создать двумерный массив типа char размером 4х2.
 * И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */
public class Exercise4 {
    public static void main(String[] args) {
        char[][] array = {
                {'1', '2'},
                {'3', '4'},
                {'5', '6'},
                {'7', '8'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
