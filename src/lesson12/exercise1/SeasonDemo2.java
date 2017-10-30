package lesson12.exercise1;

public class SeasonDemo2 {
    public static void main(String[] args) {
        Seasons season = Seasons.SPRING;
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
        }
    }
}
