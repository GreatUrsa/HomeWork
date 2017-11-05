package lesson12.exercise1;

/**
 * Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * Добавить конструктор принимающий на вход среднюю температуру.
 * Создать метод getDescription, возвращающий строку “Холодное время года”.
 * Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
 * В цикле распечатать все времена года, среднюю температуру и описание времени года.
 */
public enum SeasonTemperature {
    WINTER(-10), SPRING(11), SUMMER(26) {
        public String getDescription() {
            return "Тёплое время года";
        }
    }, AUTUMN(6);

    SeasonTemperature(int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public int getDegrees() {
        return degrees;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
