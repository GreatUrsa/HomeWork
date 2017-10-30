package lesson10.exercise5;

public class FruitSale {
    public static void main(String[] args) {
        double fullPrice = 0;
        double applePrice = 0;
        double apricotPrice = 0;
        double pearPrice = 0;

        Fruit[] fruit = new Fruit[10];
        fruit[0] = new Apple(0.234);
        fruit[1] = new Pear(0.456);
        fruit[2] = new Apple(0.134);
        fruit[3] = new Apricot(0.987);
        fruit[4] = new Apricot(0.376);
        fruit[5] = new Pear(0.844);
        fruit[6] = new Pear(0.756);
        fruit[7] = new Pear(0.543);
        fruit[8] = new Apple(0.298);
        fruit[9] = new Apricot(1.234);
        for (Fruit f : fruit) {
            fullPrice += f.price();
        }
        System.out.println("Общая сумма покупки составляет " + fullPrice);
        for (Fruit apple : fruit) {
            if (apple instanceof Apple) {
                applePrice += apple.price();
            }
        }
        System.out.println("Общая стоимость яблок - " + applePrice);
        for (Fruit apricot : fruit) {
            if (apricot instanceof Apricot) {
                apricotPrice += apricot.price();
            }
        }
        System.out.println("Общая стоимость абрикос - " + apricotPrice);
        for (Fruit pear : fruit) {
            if (pear instanceof Pear) {
                pearPrice += pear.price();
            }
        }
        System.out.println("Общая стоимость груш - " + pearPrice);
    }
}
