package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Предложение состоит из нескольких слов, например:
 * "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554".
 * Среди слов, состоящих только из цифр, найти слово-палиндром.
 */
public class Palindrome {

    public static void main(String[] args) {
        findPalindrome("Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554");
    }

    public static void findPalindrome(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            if (matcher.group().equals(new StringBuilder(matcher.group()).reverse().toString())) {
                System.out.println(matcher.group());
            }
        }
    }
}
