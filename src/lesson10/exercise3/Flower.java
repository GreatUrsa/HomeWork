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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    abstract public int price();

    public static int getCountFlowers() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower)) return false;

        Flower flower = (Flower) o;

        if (getShelfLife() != flower.getShelfLife()) return false;
        return getManufacturer() != null ? getManufacturer().equals(flower.getManufacturer()) : flower.getManufacturer() == null;
    }

    @Override
    public int hashCode() {
        int result = getManufacturer() != null ? getManufacturer().hashCode() : 0;
        result = 31 * result + getShelfLife();
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "manufacturer='" + manufacturer + '\'' +
                ", shelfLife=" + shelfLife +
                '}';
    }
}
