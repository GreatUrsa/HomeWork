package lesson13;

/**
 * Напишите метод, заменяющий в строке все вхождения «object oriented programming»
 * (не учитываем регистр символов) на «OOP».
 */
public class Exercise3 {
    public static String replaceOOP(String s) {
        return s.replaceAll("[O|o]bject-oriented[\\s]+programming", "OOP");
    }

    public static void main(String[] args) {
        String s = "Object-oriented programming  is a programming paradigm based on the concept of objects\n,"
                + "which may contain data, in the form of fields, often known as attributes;\n"
                + "and code, in the form of procedures, often known as methods.\n"
                + "Object-oriented   programming languages typically share low-level features\n" +
                " with high-level procedural programming languages (which were invented first). ";
        System.out.println(replaceOOP(s));
    }
}
