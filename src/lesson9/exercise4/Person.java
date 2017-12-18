package lesson9.exercise4;

public class Person {
    private String fullName;
    private String birthday;
    private String phone;

    public Person(String fullName, String birthday, String phone) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (fullName != null ? !fullName.equals(person.fullName) : person.fullName != null) return false;
        if (birthday != null ? !birthday.equals(person.birthday) : person.birthday != null) return false;
        return phone != null ? phone.equals(person.phone) : person.phone == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return fullName + ", дата рождения: " + birthday + ", номер телефона: " + phone;
    }
}
