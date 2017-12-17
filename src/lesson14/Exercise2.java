package lesson14;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 * Если таких слов несколько, найти первое из них.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s+");
        String[] characters = pattern.split("Один два2 три четыре пять шесть");
        System.out.println(Arrays.toString(characters));

        getMinChar(characters);
    }

    private static void getMinChar(String[] characters) {
        int sizeMin = new HashSet<>(Arrays.asList(characters[0].split(""))).size();
        String wordMinChar = characters[0];
        for (int i = 1; i < characters.length; i++) {
            Set<String> set = new HashSet<>(Arrays.asList(characters[i].split("")));
            if (set.size() < sizeMin) {
                sizeMin = set.size();
                wordMinChar = characters[i];
            }
        }
        System.out.printf("%s\n %50s\n %s\n %50d", "Число различных символов минимально в слове:",
                wordMinChar, "Количество символов:", sizeMin);
    }
}

