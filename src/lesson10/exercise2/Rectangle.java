package lesson10.exercise2;

public class Rectangle extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(String color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


    @Override
    public void draw() {
        System.out.println("Я рисую " + getColor() + " прямоугольник.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (x1 != rectangle.x1) return false;
        if (y1 != rectangle.y1) return false;
        if (x2 != rectangle.x2) return false;
        return y2 == rectangle.y2;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }

    @Override
    public String toString() {
        return "Прямоугольник с координатами(" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ") " + super.toString();
    }
}
