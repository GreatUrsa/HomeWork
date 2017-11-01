package lesson11.exercise3.p2;

import lesson11.exercise3.p1.Example1;

public class Example5 {
    public static void main(String[] args) {
        System.out.println("Класс из другого пакета, не являющийся подклассом данного:");
        Example1 example1 = new Example1();

        System.out.println("а) переменные:");
//        System.out.println(example1.a);
//        System.out.println(example1.b);
//        System.out.println(example1.c);
        System.out.println(example1.d);

        System.out.println("б) методы:");
//        example1.displayA();
//        example1.displayB();
//        example1.displayC();
        example1.displayD();
    }
}

