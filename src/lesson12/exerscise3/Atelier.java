package lesson12.exerscise3;

/**
 * д) Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину,
 * на вход которых будет поступать массив, содержащий все типы одежды.
 * Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.
 */
public class Atelier {
    public static void clotheWomen(Clothes[] clothes) {
        for (Clothes clotheWomen : clothes) {
            if (clotheWomen instanceof WomensClothing) {
                System.out.println("Одеваем женщину в " + clotheWomen);
            }
        }
    }

    public static void clotheMen(Clothes[] clothes) {
        for (Clothes clotheMen : clothes) {
            if (clotheMen instanceof MensClothing) {
                System.out.println("Одеваем мужчину в " + clotheMen);
            }
        }
    }
}
