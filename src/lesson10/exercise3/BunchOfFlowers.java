package lesson10.exercise3;

public class BunchOfFlowers {
    public static void main(String[] args) {
        int posyPrice1 = 0;
        int posyPrice2 = 0;
        int posyPrice3 = 0;

        Flower[] posy1 = new Flower[5];
        posy1[0] = new Tulip("Голландия", 10);
        posy1[1] = new Tulip("Голландия", 10);
        posy1[2] = new Tulip("Голландия", 10);
        posy1[3] = new Rose("Голландия", 6);
        posy1[4] = new Rose("Голландия", 6);

        for (Flower flower1 : posy1) {
            posyPrice1 += flower1.price();
        }
        System.out.println("Цена первого букета - " + posyPrice1);

        Flower[] posy2 = new Flower[3];
        posy2[0] = new Lotus("Франция", 2);
        posy2[1] = new Rose("Голландия", 6);
        posy2[2] = new Rose("Голландия", 6);

        for (Flower flower2 : posy2) {
            posyPrice2 += flower2.price();
        }
        System.out.println("Цена второго букета - " + posyPrice2);

        Flower[] posy3 = new Flower[7];
        posy3[0] = new Carnation("Нидерланды", 5);
        posy3[1] = new Carnation("Нидерланды", 5);
        posy3[2] = new Carnation("Нидерланды", 5);
        posy3[3] = new Carnation("Нидерланды", 5);
        posy3[4] = new Carnation("Нидерланды", 5);
        posy3[5] = new Carnation("Нидерланды", 5);
        posy3[6] = new Carnation("Нидерланды", 5);

        for (Flower flower3 : posy3) {
            posyPrice3 += flower3.price();
        }
        System.out.println("Цена третьего букета - " + posyPrice3);

        System.out.println("Количество проданных цветов: " + Flower.getCountFlowers());
    }
}
