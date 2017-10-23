package lesson8;

/**
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk().
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 * другой - Person(fullName, age).
 */
public class Person {
    String fullName;
    int age;

    void move() {
        System.out.println(fullName + " двигается.");
    }

    void talk() {
        System.out.println(fullName + " говорит.");
    }

    Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person Person1 = new Person();
        Person Person2 = new Person("Kate", 17);

        Person1.fullName = "Elizabeth";
        Person1.age = 21;
        Person1.move();
        Person1.talk();

        Person2.move();
        Person2.talk();
    }
}
