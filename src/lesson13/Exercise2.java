package lesson13;

/**
 * а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 – 56 = -53
 * 3 * 56 = 168.
 * Используем метод StringBuilder.append().
 * б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 * в) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */
public class Exercise2 {
    public static void main(String[] args) {
        String s;
        int a = 3, b = 56;

        StringBuilder sb = new StringBuilder();

        s = sb.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n").
                append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n").
                append(a).append(" * ").append(b).append(" = ").append(a * b).toString();
        System.out.println(s);

        sb.delete(6, 8).insert(6, " равно ").delete(24, 25).insert(24, "равно").
                replace(41, 42, "равно");
        System.out.println(sb);

    }
}
