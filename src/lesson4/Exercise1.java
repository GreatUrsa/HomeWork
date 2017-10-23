package lesson4;

import java.util.Scanner;

/**
 * Создать программу, которая будет выводить на экран меньшее по модулю
 * из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */
public class Exercise1 {

    public static void main(String[] args) {
        double x1, x2, x3, modx1, modx2, modx3, min;
        x1 = check("первое");
        x2 = check("второе");
        x3 = check("третье");
        modx1 = x1 > 0 ? x1 : -x1;
        modx2 = x2 > 0 ? x2 : -x2;
        modx3 = x3 > 0 ? x3 : -x3;
        min = (modx1 < modx2) ? ((modx1 < modx3) ? modx1 : modx3) : ((modx2 < modx3) ? modx2 : modx3);
        System.out.println(min + " - минимальное число по модулю.");
    }

    public static double check(String x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + x + " число:");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Неверные данные. Повторите попытку.");
            return check(x);
        }
    }
}
