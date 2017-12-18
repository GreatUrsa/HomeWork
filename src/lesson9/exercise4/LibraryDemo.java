package lesson9.exercise4;

/**
 * Разработать программу, в которой создается массив объектов данного класса.
 * В программе организовать: ввод данных о читателях,  вывод информации о читателях.
 */
public class LibraryDemo {
    public static void main(String[] args) {
        User[] user = {
                new User("Лепская Лидия Александровна", "23.03.1994", "0953451386", 3006, 4),
                new User("Бычков Егор Юрьевич", "03.08.1993", "0674351234", 3007, 4),
                new User("Морозова Ольга Ивановна", "14.06.1994", "0995671984", 3008, 4)
        };

        Book[] bookFr = new Book[1];
        bookFr[0] = new Book("L'Homme qui rit", "Victor Marie Hugo");

        Book[] bookEn = new Book[3];
        bookEn[0] = new Book("Pride and Prejudice", "Jane Austen");
        bookEn[1] = new Book("Jane Eyre", "Charlotte Brontë");
        bookEn[2] = new Book("A Scandal in Bohemia", "Sir Arthur Ignatius Conan Doyle");

        printUsers(user);
        System.out.println();

        user[0].takeBook(4);
        user[0].returnBook(2);
        System.out.println();

        user[1].takeBook("Горе от ума", "Мцыри");
        user[1].returnBook(("Идиот"));
        System.out.println();

        user[2].takeBook(bookEn);
        user[2].returnBook(bookFr);
    }

    public static void printUsers(User[] user) {
        System.out.println("Пользователи библиотеки:");
        for (User users : user) {
            System.out.println(users);
        }
    }
}
