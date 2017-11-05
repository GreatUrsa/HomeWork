package lesson12.exercise1;

public class SeasonTemperatureDemo {
    public static void main(String[] args) {
        for (SeasonTemperature seasonTemperature : SeasonTemperature.values()) {
            System.out.println(seasonTemperature + " " + seasonTemperature.getDescription()
                    + ". Средняя температура " + seasonTemperature.getDegrees() + '\u2103');
        }
    }
}
