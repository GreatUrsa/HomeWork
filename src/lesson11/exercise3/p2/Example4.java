package lesson11.exercise3.p2;

import lesson11.exercise3.p1.Example1;

public class Example4 extends Example1 {
    public static void main(String[] args) {
        System.out.println("Подкласс, находящийся в другом пакете:");
        Example4 example4 = new Example4();

        System.out.println("а) переменные:");
//        System.out.println(example4.a);
//        System.out.println(example4.b);
        System.out.println(example4.c);
        System.out.println(example4.d);

        System.out.println("б) методы:");
//        example4.displayA();
//        example4.displayB();
        example4.displayC();
        example4.displayD();
    }
}
