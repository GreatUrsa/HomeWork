package lesson7;

/**
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива
 * (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */

import java.util.Arrays;

public class BubbleSorter {

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 8, 11, 86, 22, 7};
        System.out.println("Массив до пузырьковой сортировкой: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean theEnd;
        for (int i = 0; i < array.length; i++) {
            theEnd = true;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    theEnd=false;
                }
            }
            if (theEnd) break;
        }
    }
}

