package lesson5;

/**
 * Переписать гирлянду используя оператор switch для  выбора  нужной операции.
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 */
public class Exercise6 {
    public static void main(String[] args) {
        String operation = args[0];
        int garland = 38, maska = 1;
        switch (operation) {
            case "a":
                int flashing = (int) ~garland;
                System.out.println(Integer.toBinaryString(flashing));
                break;
            case "б":
                garland >>= 1;
                System.out.println(String.format("%027d", 0) + Integer.toBinaryString(garland));
                break;
            case "в":
                garland &= maska;
                System.out.println(String.format("%031d", 0) + Integer.toBinaryString(garland));
                break;
            default:
                System.out.println(String.format("%026d", 0) + Integer.toBinaryString(garland));
        }
    }
}

