package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка “Versions: Java  5, Java 6, Java   7, Java 8.” .Найти все подстроки "Java X" и распечатать их.
 */
public class Exercise1 {
    public static void main(String[] args) {
        String regex = "(\\w{4} +\\s|\\d)";
        //String regex = "(Java\\s*\\d)";
        String s = "Versions: Java  5, Java 6, Java   7, Java 8.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("Java X: " + matcher.group());
        }
    }
}
