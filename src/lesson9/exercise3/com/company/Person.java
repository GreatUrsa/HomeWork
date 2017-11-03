package lesson9.exercise3.com.company;

import lesson9.exercise3.com.company.professions.Driver;

public class Person extends Driver {
    private int age;

    public Person(String name, int drivingExperience, int age) {
        super(name, drivingExperience);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Person person = (Person) o;

        return age == person.age;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                "} " + super.toString();
    }
}
