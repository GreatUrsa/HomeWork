package lesson14.exercise6;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Создать класс FullReport, который выводит ту же информацию, что и Report из предыдущего урока,
 * и добавляет дату выдачи зарплаты. Использовать классы NumberFormat и DateFormat.
 * Заголовок отчета должен изменяться в зависимости от выбранной локали (используем класс ResourceBundle).
 */
public class FullReport {
    public static void generateReport(Employee[] employees, String language, String country) throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("salary", current);

        String s1 = rb.getString("str1");
        String s2 = rb.getString("str2");
        String s3 = rb.getString("str3");
        s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
        s2 = new String(s2.getBytes("ISO-8859-1"), "UTF-8");
        s3 = new String(s3.getBytes("ISO-8859-1"), "UTF-8");

        System.out.printf("%-13s %-28s %s\n", s1, s2, s3);
        System.out.println("---------------------------------------------------");

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(1);

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);

        for (Employee employee : employees)
            System.out.printf("%-10s    %-25s    %s\n", df.format(employee.getSalaryDate()),
                    employee.getFullName(), nf.format(employee.getSalary()));
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Иванов Иван Петрович", 3500.543, new Date());
        employees[1] = new Employee("Петрова Елена Евгеньевна", 3200.5, new Date());

        generateReport(employees, "en", "US");
        System.out.println();
        generateReport(employees, "ru", "RU");
    }
}
