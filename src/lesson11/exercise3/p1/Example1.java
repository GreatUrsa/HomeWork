package lesson11.exercise3.p1;

public class Example1 {
    private String a = "private";
    String b = "default";
    protected String c = "protected";
    public String d = "public";

    private void displayA() {
        System.out.println(a);
    }

    void displayB() {
        System.out.println(b);
    }

    protected void displayC() {
        System.out.println(c);
    }

    public void displayD() {
        System.out.println(d);
    }

    public static void main(String[] args) {
        System.out.println("Один и тот же класс:");
        Example1 example1 = new Example1();

        System.out.println("а) переменные:");
        System.out.println(example1.a);
        System.out.println(example1.b);
        System.out.println(example1.c);
        System.out.println(example1.d);

        System.out.println("б) методы:");
        example1.displayA();
        example1.displayB();
        example1.displayC();
        example1.displayD();
    }
}
