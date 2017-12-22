package lesson9.exercise4;

/**
 * Хранит номер читательского билета и факультет пользователя библиотеки.
 * Реализует перегруженные методы takeBook() и returnBook(), распечатывающие
 * информацию о книгах взятых и возвращённых пользователями.
 *
 * @author GreatUrsa
 * @version 1.0
 */
public class User extends Person {
    /**
     * Свойство - номер читательского билета
     */
    private int idCard;
    /**
     * Свойство - факультет
     */
    private int faculty;

    /**
     * Создаёт новый объект с заданными значениями
     *
     * @param fullName - фио
     * @param birthday - дата рождения
     * @param phone    - номер телефона
     * @param idCard   - номер читательского билета
     * @param faculty  - факультет
     */
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

    /**
     * Распечатывает количество  книг, взятых пользователем
     *
     * @param number количество взятых книг
     */
    public void takeBook(int number) {
        System.out.println("Пользователь: " + this.getFullName()
                + ". Количество взятых книг - " + number);
    }

    /**
     * Распечатывает количество книг, возвращённых пользователем
     *
     * @param number количество возвращённых книг
     */
    public void returnBook(int number) {
        System.out.println("Пользователь: " + this.getFullName()
                + ". Количество возвращённых книг - " + number);
    }

    /**
     * Распечатывает названия книг, взятых пользователем
     *
     * @param books названия книг
     */
    public void takeBook(String... books) {
        System.out.println("Пользователь " + this.getFullName() + " взял:");
        for (String book : books) {
            System.out.println('\u0022' + book + '\u0022');
        }
    }

    /**
     * Распечатывает названия книг, возвращённых пользователем
     *
     * @param books названия книг
     */
    public void returnBook(String... books) {
        System.out.println("Пользователь " + this.getFullName() + " вернул:");
        for (String book : books) {
            System.out.println('\u0022' + book + '\u0022');
        }
    }

    /**
     * Распечатывает название и автора книг, взятых пользователем
     *
     * @param books объект класса Book
     */
    public void takeBook(Book... books) {
        System.out.println("Пользователь " + this.getFullName() + " взял: ");
        for (Book book : books) {
            System.out.println('\u0022' + book.getTitle() + '\u0022' + ", автор - " + book.getAuthor());
        }
    }

    /**
     * Распечатывает название и автора книг, возвращённых пользователем
     *
     * @param books объект класса Book
     */
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
