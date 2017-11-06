package lesson13;

/**
 * a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * б) Распечатать последний символ строки. Используем метод String.charAt().
 * в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * д) Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * е) Заменить все символы “а” на “о”.
 * ж) Преобразуйте строку к верхнему регистру.
 * з) Преобразуйте строку к нижнему регистру.
 * и) Вырезать строку Java c помощью метода String.substring.
 */
public class LikeJava {
    public static void main(String[] args) {
        String str1 = "I like Java!!!";

        LikeJava.check(str1);
    }

    public static void check(String str) {
        System.out.println(str);
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println("indexOf(Java) = " + str.indexOf("Java"));
        System.out.println(str.substring(7, 11));
    }
}
