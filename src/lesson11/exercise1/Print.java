package lesson11.exercise1;

public class Print {
    public static void main(String[] args) {
        Printable[] printable = new Printable[3];
        printable[0] = new Book("Jane Eyre");
        printable[1] = new Magazine("Rolling Stone");
        printable[2] = new Book("Pride and Prejudice");
        for (Printable a : printable) {
            a.print();
        }
        printBooks(printable);
        printMagazines(printable);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable magazines : printable) {
            if (magazines instanceof Magazine)
                System.out.println("Журнал " + ((Magazine) magazines).getName());
        }
    }

    public static void printBooks(Printable[] printable) {
        for (Printable books : printable) {
            if (books instanceof Book) {
                System.out.println("Книга " + ((Book) books).getName());
            }
        }
    }
}
