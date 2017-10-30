package lesson12.exercise1;

public class SeasonDemo3 {
    public static void main(String[] args) {
        Seasons season;
        System.out.println("Времена года: ");
        for (Seasons season1 : Seasons.values()) {
            System.out.println(season1);
        }
        System.out.println();
        season = Seasons.valueOf("SPRING");
        System.out.println("Моё любимое время года - " + season);
    }
}
