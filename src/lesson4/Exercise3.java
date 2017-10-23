package lesson4;

/**
 * Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Используйте цикл for, пример. Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
public class Exercise3 {
    public static void main(String[] args) {
        int len = args.length;
        double sum = 0;
        for (String str : args) {
            sum += Double.parseDouble(str);
        }
        if (len == 0) {
            System.out.println("Не заданы аргументы");
        } else {
            System.out.println("Среднее значение = " + sum / len);
        }
    }
}
