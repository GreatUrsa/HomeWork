package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найти количество слов, содержащих только символы латинского алфавита.
 */
public class LatinWords {
    public static void main(String[] args) {
        String s = "Платформа Java предоставляет класс строк (class String) для создания и работы со строками.";
        System.out.println("Заданная строка: " + s);
        countLatinWords(s);
    }

    public static void countLatinWords(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-z]+");
        Matcher matcher = pattern.matcher(s);
        System.out.println("Слова, содержащих символы только латинского алфавита:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            count++;
        }
        System.out.println("\nКоличество слов, содержащих только символы латинского алфавита: " + count);
    }
}
