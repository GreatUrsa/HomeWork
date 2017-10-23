package lesson5;

/**
 * Переписать задание 1 используя switch.
 */
public class Exercise2 {
    public static void main(String[] args) {
        String week = args[0];
        switch (week) {
            case "1":
                System.out.println("Понедельник");
                break;
            case "2":
                System.out.println("Вторник");
                break;
            case "3":
                System.out.println("Среда");
                break;
            case "4":
                System.out.println("Четверг");
                break;
            case "5":
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной");
        }
    }
}
