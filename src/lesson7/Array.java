package lesson7;

import java.util.Arrays;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */

public class Array {
    public static void main(String[] args) {

        int[][] array = {
                {2, 4, 78, 32, 5, 90, 43, 205},
                {5, 6, 34, 12, 87, 78, 2, 81},
                {23, 67, 88, 79, 94, 12, 47, 31},
                {4, 56, 72, 13, 90, 123, 51, 97},
                {1, 2, 32, 58, 987, 3, 64, 78}
        };
        System.out.println(Arrays.deepToString(array));
        elMaxMin(array);
    }

    static void elMaxMin(int[][] array) {
        int [][] res = new int [array.length][2];
        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            int min = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];

                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
            res[i][0] = max;
            res[i][1] = min;
        }
        System.out.print(Arrays.deepToString(res));
    }
}



