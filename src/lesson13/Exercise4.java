package lesson13;

/**
 * Даны строки разной длины (длина - четное число)
 * необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */
public class Exercise4 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "String";
        strings[1] = "code";
        strings[2] = "Practice";
        for (String s : strings) {
            twoMediumSigns(s);
        }
    }

    public static void twoMediumSigns(String s) {
        System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
    }
}

