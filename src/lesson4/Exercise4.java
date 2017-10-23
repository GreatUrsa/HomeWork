package lesson4;

/**
 * Передать на вход программы число в качестве аргумента.
 * Если оно нечетное, распечатать его. Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.(Задание с урока.)
 */
public class Exercise4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 != 0) {
            System.out.println(n + " - нечётное.");
        }
    }
}
