package lesson12.exercise1;

/**
 * Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
 * Добавить конструктор принимающий на вход среднюю температуру.
 */
public enum SeasonTemperature {
    WINTER(-10), SPRING(11), SUMMER(26), AUTUMN(6);

    SeasonTemperature(int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public int getDegrees() {
        return degrees;
    }
}
