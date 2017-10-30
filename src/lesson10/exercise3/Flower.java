package lesson10.exercise3;

/**
 * Создать класс "Flower", который содержит переменные страна производитель и срок хранения в днях.
 * Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны
 * и... что-то на свой вкус). Суперкласс "Flower" должен содержать абстрактный метод определяющий стоимость цветка,
 * этот метод переопределить в классах наследниках.  Собрать 3 букета (используем массив)
 * с определением их стоимости. В букет может входить несколько цветов разного типа.
 * Также подсчитать количество проданных цветов (используем статический метод).
 */
abstract public class Flower {
    private static int count = 0;
    private String manufacturer;
    private int shelfLife;

    public Flower(String name, int shelfLife) {
        this.manufacturer = name;
        this.shelfLife = shelfLife;
        count++;
    }

    abstract public int price();

    public static int getCountFlowers() {
        return count;
    }
}
