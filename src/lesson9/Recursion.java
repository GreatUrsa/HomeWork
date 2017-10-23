package lesson9;

/**
 * Даны два целых числа A и В. Выведите все числа от A до B включительно,
 * в порядке возрастания, если A < B, или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */
public class Recursion {
    public static void recurs (int a, int b) {
        System.out.print(a +" ");
        if (a == b) {
            return;
        }
        if (a < b) {
            a++;
        } else {
            a--;
        }
        recurs(a, b);
    }

    public static void main(String[] args) {
        recurs(1, 10);
    }
}
