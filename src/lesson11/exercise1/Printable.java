package lesson11.exercise1;

/**
 * Определить интерфейс Printable, содержащий метод  void print(). Определить класс Book, реализующий интерфейс Printable.
 * Определить класс Magazine, реализующий интерфейс Printable. Создать массив типа Printable,
 * который будет содержать книги и журналы. В цикле пройти по массиву и вызвать метод print для каждого объекта.
 * Создать статический метод printMagazines(Printable[] printable), который выводит на консоль названия только журналов.
 * Создать статический метод printBooks(Printable[] printable), который выводит на консоль названия только книг.
 * Используем оператор instanceof.
 */

public interface Printable {
    void print();
}
