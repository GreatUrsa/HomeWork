package lesson10.exercise2;

public class Circle extends Shape {
    private int x;
    private int y;
    private int r;

    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Я рисую " + color + " круг.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        if (y != circle.y) return false;
        return r == circle.r;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + r;
        return result;
    }

    @Override
    public String toString() {
        return "Круг с координатами(" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ") " + super.toString();
    }
}
