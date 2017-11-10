package lesson15;

import lesson11.exercise4.Guitar;

import java.util.Arrays;

/**
 * Напишите программу, выводящую на консоль всю метаинформацию о выбранном классе.
 */
public class Exercise6 {
    public static void main(String[] args) {
        Class guitarClass = Guitar.class;

        System.out.println("Class name - " + guitarClass.getName());
        System.out.println("Is Array? " + guitarClass.isArray());
        System.out.println("Is Enum? " + guitarClass.isEnum());
        System.out.println("Is Member? " + guitarClass.isMemberClass());
        System.out.println("Is Primitive? " + guitarClass.isPrimitive());

        System.out.println();

        System.out.println("Declared Constructors: " + Arrays.toString(guitarClass.getDeclaredMethods()));
        System.out.println("Constructors: " + Arrays.toString(guitarClass.getConstructors()));

        System.out.println("Declared Methods: " + Arrays.toString(guitarClass.getDeclaredMethods()));
        System.out.println("Methods: " + Arrays.toString(guitarClass.getMethods()));

        System.out.println("Declared Fields: " + Arrays.toString(guitarClass.getDeclaredFields()));
        System.out.println("Fields: " + Arrays.toString(guitarClass.getFields()));
    }
}
