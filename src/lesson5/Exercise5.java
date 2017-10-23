package lesson5;

/**
 * Распечатать 55 символов в одну строку начиная с ‘h’. Используем цикл for.
 */
public class Exercise5 {
    public static void main(String[] args) {
        char x = 'h';
        for (int i = 1; i <= 55; i++) {
            System.out.print(x + " ");
            x++;
        }
    }
}
