package lesson13;

import lesson9.exercise3.com.company.Person;

public class Exercise5 {
    public static void main(String[] args) {
        Person person = new Person("Kate", 10);
        System.out.println(person);
        change(person);
    }

    public static void change(Person person) {
        System.out.println(person.toString().substring(0, person.toString().length() - 2).
                concat(".").replace("Водитель", "Имя"));
    }
}

