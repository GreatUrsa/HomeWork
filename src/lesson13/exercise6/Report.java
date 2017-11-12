package lesson13.exercise6;

/**
 * Создать класс Report, который будет содержатьстатический метод generateReport,
 * в котором выводится информация о зарплате всех сотрудников.
 * Используйте форматировании строк. Пусть salary будет выровнено по правому краю,
 * десятичное значение имеет 2 знака после запятой и можете добавить что-нибудь свое.
 */
public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees)
            System.out.println(employee);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Иванов Иван Петрович", 3500.543);
        employees[1] = new Employee("Петрова Елена Евгеньевна", 3200.5);
        generateReport(employees);
    }
}
