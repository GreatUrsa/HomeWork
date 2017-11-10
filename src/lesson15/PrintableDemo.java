package lesson15;

import lesson11.exercise1.Printable;

/**
 * Создать анонимный класс расширяющий интерфейс Printable. Вызвать его метод print().(
 */
public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Вывод на печать.");
            }
        };
        printable.print();
    }
}
