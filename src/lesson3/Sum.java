package lesson3;

import java.util.Scanner;

/**
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
public class Sum {

    public static void main(String[] args) {
        int sum = check("первое") + check("второе");
        System.out.println("Сумма двух чисел = " + sum);
    }

    public static int check(String x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + x + " число:");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Неверные данные. Повторите попытку.");
            return check(x);
        }
    }
}
