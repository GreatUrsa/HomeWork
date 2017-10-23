package lesson5;

/**
 * Передать на вход программы число От 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д.
 * Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if.
 */
public class Exercise1 {
    public static void main(String[] args) {
        String str = args[0];
        if (str.equals("1")) {
            System.out.println("Понедельник");
        } else if (str.equals("2")) {
            System.out.println("Вторник");
        } else if (str.equals("3")) {
            System.out.println("Среда");
        } else if (str.equals("4")) {
            System.out.println("Четверг");
        } else if (str.equals("5")) {
            System.out.println("Пятница");
        } else {
            System.out.println("Выходной");
        }
    }
}
