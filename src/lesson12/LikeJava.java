package lesson12;

/*
Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
Распечатать последний символ строки. Используем метод String.charAt().
Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String. startsWith().
 */
public class LikeJava {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();

        str1 = "I like Java!!!";
        str2 = "I like JavaScript!";

        System.out.println(str1);
        LikeJava.check(str1);
        System.out.println(str2);
        LikeJava.check(str2);
    }

    public static void check(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
    }
}
