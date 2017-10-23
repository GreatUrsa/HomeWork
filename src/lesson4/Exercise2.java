package lesson4;

/**
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 */
public class Exercise2 {
    public static void main(String[] args) {
        int garland = 38;
        int maska = 1;
        System.out.println("Лампочки мигают 10 раз:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%026d", 0) + Integer.toBinaryString(garland));
            int flashing = (int) ~garland;
            System.out.println(Integer.toBinaryString(flashing));
            flashing >>= 1;
            System.out.println(Integer.toBinaryString(flashing));
            flashing &= maska;
            System.out.println(String.format("%031d", 0) + Integer.toBinaryString(flashing));
            garland++;
        }
    }
}
