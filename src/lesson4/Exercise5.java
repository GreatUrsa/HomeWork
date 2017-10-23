package lesson4;

import java.util.Scanner;

/**
 * С помощью класса Scanner ввести целое число. Если это число от 0 до 10,
 * вывести на консоль сообщение “Положительное число меньше 10”,
 * иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 * Используем оператор if-else. (Задание с урока.)
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 10 && n > 0) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
    }
}
