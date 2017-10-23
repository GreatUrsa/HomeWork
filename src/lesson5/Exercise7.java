package lesson5;

/**
 * Реализовать подсчет факториала используя цикл for.
 * Число n задается случайным образом (используйте Math.random()).
 */
public class Exercise7 {
    public static void main(String[] args) {
        int f = 1;
        int a = (int) (Math.random() * 6);
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        System.out.println(a + "! = " + f);
    }
}
