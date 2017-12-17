package lesson14.exercise7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Распечатать график праздников на текущий год используя форматирование. (SimpleDateFormat)
 */
public class HolidayCalendarDemo {
    public static void main(String[] args) throws ParseException {
        Holiday[] holiday = new Holiday[10];
        holiday[0] = new Holiday("Новый 2017 год", "01.01.17");
        holiday[1] = new Holiday("Рождество", "07.01.17");
        holiday[2] = new Holiday("Международный женский день", "08.03.17");
        holiday[3] = new Holiday("Пасха", "16.04.17");
        holiday[4] = new Holiday("праздник Весны и Труда", "01.05.17");
        holiday[5] = new Holiday("День Победы", "09.05.17");
        holiday[6] = new Holiday("Троица", "04.06.17");
        holiday[7] = new Holiday("день Конституции Украины", "28.06.17");
        holiday[8] = new Holiday("День Независимости Украины", "24.08.17");
        holiday[9] = new Holiday("День защитника Украины", "14.10.17");

        getHoliday(holiday);
    }

    public static void getHoliday(Holiday[] holidays) throws ParseException {
        System.out.println("Государственные Праздники Украины 2017: \n");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df = new SimpleDateFormat("День dd Месяц MM");
        for (Holiday holiday : holidays) {
            System.out.printf("%-30s %s\n", holiday.getName(), df.format(dateFormat.parse(holiday.getDate())));
        }
    }
}
