package lesson3;

/**
 * Создать программу, в которой последовательно прописать
 * преобразования всех совместимых примитивных типов друг к другу.
 * Преобразование для каждого типа вынесите в отдельный метод.
 */
public class Types {

    public static void main(String[] args) {
        convertToByte();
        convertToShort();
        convertToChar();
        convertToInt();
        convertToLong();
        convertToFloat();
        convertToDouble();
    }

    static void convertToByte() {
        byte b = 22;
        short s = 2;
        char c = 0x333;
        int i = 11;
        long l = 17990606L;
        float f = 34.34F;
        double d = .5;
        b = (byte) s;
        b = (byte) c;
        b = (byte) i;
        b = (byte) l;
        b = (byte) f;
        b = (byte) d;

    }

    static void convertToShort() {
        short s = 2;
        byte b = 3;
        char c = 0x333;
        int i = 7;
        long l = 17990606L;
        float f = 34.34F;
        double d = .5;
        s = b;
        s = (short) c;
        s = (short) i;
        s = (short) l;
        s = (short) f;
        s = (short) d;
    }

    static void convertToChar() {
        char c = 0x333;
        byte b = 3;
        short s = 2;
        int i = 7;
        long l = 17990606L;
        float f = 34.34F;
        double d = .5;
        c = (char) b;
        c = (char) s;
        c = (char) i;
        c = (char) l;
        c = (char) f;
        c = (char) d;
    }

    static void convertToInt() {
        int i = 7;
        byte b = 3;
        short s = 2;
        char c = 0x333;
        long l = 17990606L;
        float f = 34.34F;
        double d = .5;
        i = b;
        i = s;
        i = c;
        i = (int) l;
        i = (int) f;
        i = (int) d;
    }

    static void convertToLong() {
        long l = 17990606L;
        byte b = 3;
        short s = 2;
        char c = 0x333;
        int i = 7;
        long a = 17990606L;
        float f = 34.34F;
        double d = .5;
        a = b;
        a = s;
        a = c;
        a = i;
        a = (long) f;
        a = (long) d;
    }

    static void convertToFloat() {
        float f = 34.34F;
        byte b = 3;
        short s = 2;
        char c = 0x333;
        int i = 7;
        long l = 17990606L;
        float t = 34.34F;
        double d = .5;
        t = b;
        t = s;
        t = c;
        t = i;
        t = l;
        t = (float) d;
    }

    static void convertToDouble() {
        double d = .5;
        byte b = 3;
        short s = 2;
        char c = 0x333;
        int i = 7;
        long l = 17990606L;
        float f = 34.34F;
        d = b;
        d = s;
        d = c;
        d = i;
        d = l;
        d = f;
    }
}
