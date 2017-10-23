package lesson6;

/**
 * Создать массив типа String с размером 7. Записать в него значения дней недели.
 * Вывести на консоль значение последнего элемента.
 */
public class Exercise1 {

    public static void main(String[] args) {
        String[] week = new String[7];
        week[0] = "Понедельник";
        week[1] = "Вторник";
        week[2] = "Среда";
        week[3] = "Четверг";
        week[4] = "Пятница";
        week[5] = "Суббота";
        week[6] = "Воскресенье";
        System.out.println(week[6]);
    }
}
