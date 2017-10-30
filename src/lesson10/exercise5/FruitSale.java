package lesson10.exercise5;

public class FruitSale {
    public static void main(String[] args) {
        double fullPrice = 0;
        double applePrice = 0;
        double apricotPrice = 0;
        double pearPrice = 0;

        Fruit[] fruits = new Fruit[10];
        fruits[0] = new Apple(0.234);
        fruits[1] = new Pear(0.456);
        fruits[2] = new Apple(0.134);
        fruits[3] = new Apricot(0.987);
        fruits[4] = new Apricot(0.376);
        fruits[5] = new Pear(0.844);
        fruits[6] = new Pear(0.756);
        fruits[7] = new Pear(0.543);
        fruits[8] = new Apple(0.298);
        fruits[9] = new Apricot(1.234);
        for (Fruit fruit : fruits) {
            fullPrice += fruit.price();
        }
        System.out.println("Общая сумма покупки составляет " + fullPrice);
        for (Fruit apple : fruits) {
            if (apple instanceof Apple) {
                applePrice += apple.price();
            }
        }
        System.out.println("Общая стоимость яблок - " + applePrice);
        for (Fruit apricot : fruits) {
            if (apricot instanceof Apricot) {
                apricotPrice += apricot.price();
            }
        }
        System.out.println("Общая стоимость абрикос - " + apricotPrice);
        for (Fruit pear : fruits) {
            if (pear instanceof Pear) {
                pearPrice += pear.price();
            }
        }
        System.out.println("Общая стоимость груш - " + pearPrice);
    }
}
