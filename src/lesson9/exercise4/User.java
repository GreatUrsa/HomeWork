package lesson9.exercise4;

/**
 * Определить класс, хранящий такую информацию о пользователе библиотеки:
 * ФИО, номер читательского билета, факультет, дата рождения, телефон.
 * Методы takeBook(), returnBook().
 * Перегрузить методы takeBook(), returnBook():
 * - takeBook, который будет принимать количество взятых книг.
 * - takeBook, который будет принимать переменное количество названий книг.
 * - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс).
 * Аналогичным образом перегрузить метод returnBook().
 */
public class User extends Person {
    private int idCard;
    private int faculty;

    public User(String fullName, String birthday, String phone, int idCard, int faculty) {
        super(fullName, birthday, phone);
        this.idCard = idCard;
        this.faculty = faculty;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public void takeBook(int number) {
        System.out.println("Пользователь: " + this.getFullName()
                + ". Количество взятых книг - " + number);
    }

    public void returnBook(int number) {
        System.out.println("Пользователь: " + this.getFullName()
                + ". Количество возвращённых книг - " + number);
    }

    public void takeBook(String... books) {
        System.out.println("Пользователь " + this.getFullName() + " взял:");
        for (String book : books) {
            System.out.println('\u0022' + book + '\u0022');
        }
    }

    public void returnBook(String... books) {
        System.out.println("Пользователь " + this.getFullName() + " вернул:");
        for (String book : books) {
            System.out.println('\u0022' + book + '\u0022');
        }
    }

    public void takeBook(Book... books) {
        System.out.println("Пользователь " + this.getFullName() + " взял: ");
        for (Book book : books) {
            System.out.println('\u0022' + book.getTitle() + '\u0022' + ", автор - " + book.getAuthor());
        }
    }

    public void returnBook(Book... books) {
        System.out.println("Пользователь " + this.getFullName() + " вернул: ");
        for (Book book : books) {
            System.out.println('\u0022' + book.getTitle() + '\u0022' + ", автор - " + book.getAuthor());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (idCard != user.idCard) return false;
        return faculty == user.faculty;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + idCard;
        result = 31 * result + faculty;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", номер читательского билета - " + idCard + ", факультет - " + faculty;
    }
}
