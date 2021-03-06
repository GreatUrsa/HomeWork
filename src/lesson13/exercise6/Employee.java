package lesson13.exercise6;

/**
 * Создать класс Employee, у которого есть переменные класса - fullName, salary.
 * Создать массив содержащий несколько объектов этого типа.
 */
public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return fullName != null ? fullName.equals(employee.fullName) : employee.fullName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullName != null ? fullName.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s \n%s%30.2f\n", fullName, "Зарплата:", salary);
    }
}
