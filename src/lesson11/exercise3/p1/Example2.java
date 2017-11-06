package lesson11.exercise3.p1;

public class Example2 extends Example1 {
    public static void main(String[] args) {
        System.out.println("Подкласс, находящийся в том же пакете, что и суперкласс:");
        Example2 example2 = new Example2();

        System.out.println("а) переменные:");
//        System.out.println(example2.a);
        System.out.println(example2.b);
        System.out.println(example2.c);
        System.out.println(example2.d);

        System.out.println("б) методы:");
//        example2.displayA();
        example2.displayB();
        example2.displayC();
        example2.displayD();
    }
}
