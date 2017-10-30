package lesson11.exercise1;

public class Print {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Book("Jane Eyre");
        printables[1] = new Magazine("Rolling Stone");
        printables[2] = new Book("Pride and Prejudice");
        for (Printable printable : printables) {
            printable.print();
        }
        printBooks(printables);
        printMagazines(printables);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable magazine : printable) {
            if (magazine instanceof Magazine)
                System.out.println("Журнал " + ((Magazine) magazine).getName());
        }
    }

    public static void printBooks(Printable[] printable) {
        for (Printable book : printable) {
            if (book instanceof Book) {
                System.out.println("Книга " + ((Book) book).getName());
            }
        }
    }
}
