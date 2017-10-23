package lesson9;

/**
 * Создать класс Circle, который содержит
 * - переменную radius;
 * - методы, вычисляющие площадь и длину окружности;
 * - константу PI.
 * Создать несколько объектов данного класса.
 */
public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    static final double PI = 3.14;

    public double getArea() {
        return PI * radius * radius;
    }

    public double getLength() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(10);

        System.out.println("Площадь первой окружнсти: " + circle1.getArea());
        System.out.println("Длина первой окружности: " + circle1.getLength());
        System.out.println("Площадь второй окружнсти: " + circle2.getArea());
        System.out.println("Длина второй окружности: " + circle2.getLength());
    }
}
