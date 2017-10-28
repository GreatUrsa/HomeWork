package lesson10.exercise2;

/**
 * Создайте суперкласс Shape и его наследники Circle, Rectangle.
 * Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет.
 * Классы Circle, Rectangle содержат координаты точек. Создать массив содержащий эти фигуры.
 * В цикле нарисовать их (вызвать метод draw).
 * Добавить методы toString(), equals() и hashCode() для классов Shape, Circle, Rectangle.
 */

public class FindColor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("красный", 0, 0, 5);
        shapes[1] = new Circle("синий", 5, 6, 10);
        shapes[2] = new Rectangle("чёрный", 2, 3, 4, 5);
        shapes[3] = new Rectangle("чёрный", 2, 3, 4, 5);
        for (Shape figure : shapes) {
            figure.draw();
            System.out.println(figure);
        }
        System.out.println(shapes[0].equals(shapes[1]));
        System.out.println(shapes[0].equals(shapes[2]));
        System.out.println(shapes[2].equals(shapes[3]));
    }
}
