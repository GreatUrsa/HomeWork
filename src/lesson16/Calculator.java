package lesson16;

/**
 * Написать класс Калькулятор (необобщенный), который содержит
 * обобщенные статические методы - sum, multiply, divide, subtraction.
 * Параметры этих методов  - два числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculator {
    public static void main(String[] args) {
        int x = 7;
        double y = 12.5;

        System.out.println("Первое число: " + x);
        System.out.println("Второе число: " + y);
        System.out.println("Сумма: " + sum(x, y));
        System.out.println("Разность: " + subtraction(x, y));
        System.out.println("Произведение: " + multiply(x, y));
        System.out.println("Частное: " + divide(x, y));
    }

    public static <T extends Number, V extends Number> double sum(T x, V y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T x, V y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T x, V y) {
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T x, V y) {
        return x.doubleValue() - y.doubleValue();
    }
}
