package lesson3;

import java.util.Scanner;

/**
 * Создать программу, которая будет сообщать, является ли целое число,
 * введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
public class EvenAndOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Введите целое число:");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " - чётное число");
            } else {
                System.out.println(num + " - нечётное число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
