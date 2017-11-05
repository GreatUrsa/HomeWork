package lesson12;

/**
 * а) Создайте объекты класса Double, используя методы valueOf().
 * б) Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
 * в) Преобразовать объект класса Double ко всем примитивным типам.
 * г) Вывести значение объекта Double на консоль.
 * д) Преобразовать литерал типа double к строке String d = Double.toString(3.14);
 * Сделать то же самое для остальных классов оболочек. Создать отдельный метод для каждого класса оболочки.
 */
public class exercise3 {
    public static void main(String[] args) {
        ByteDemo();
        ShortDemo();
        IntegerDemo();
        LongDemo();
        FloatDemo();
        DoubleDemo();
        BooleanDemo();
    }

    public static void ByteDemo() {
        Byte b1 = Byte.valueOf("127");
        Byte b2 = Byte.valueOf("101011", 2);
        System.out.println(b1 + ", " + b2);

        byte b3 = Byte.parseByte("-128");
        byte b4 = Byte.parseByte("23", 10);
        System.out.println(b3 + ", " + b4);

        System.out.println(b1.byteValue());
        System.out.println(b1.shortValue());
        System.out.println(b1.intValue());
        System.out.println(b1.longValue());
        System.out.println(b1.floatValue());
        System.out.println(b1.doubleValue());

        String b = Byte.toString(b1);
        System.out.println(b);
    }

    public static void ShortDemo() {
        Short s1 = Short.valueOf("25");
        Short s2 = Short.valueOf("25", 10);
        System.out.println(s1 + ", " + s2);

        short s3 = Short.parseShort("1123");
        short s4 = Short.parseShort("34", 10);
        System.out.println(s3 + ", " + s4);

        System.out.println(s1.byteValue());
        System.out.println(s1.shortValue());
        System.out.println(s1.intValue());
        System.out.println(s1.longValue());
        System.out.println(s1.floatValue());
        System.out.println(s1.doubleValue());

        String s = Short.toString(s1);
        System.out.println(s);
    }

    public static void IntegerDemo() {
        Integer i1 = Integer.valueOf(2);
        Integer i2 = Integer.valueOf("25");
        Integer i3 = Integer.valueOf("34", 10);
        System.out.println(i1 + ", " + i2 + ", " + i3);

        int i4 = Integer.parseInt("54");
        int i5 = Integer.parseInt("87", 16);
        System.out.println(i4 + ", " + i5);

        System.out.println(i1.byteValue());
        System.out.println(i1.shortValue());
        System.out.println(i1.intValue());
        System.out.println(i1.longValue());
        System.out.println(i1.floatValue());
        System.out.println(i1.doubleValue());

        String i = Integer.toString(i1);
        System.out.println(i);
    }

    public static void LongDemo() {
        Long l1 = Long.valueOf(3456L);
        Long l2 = Long.valueOf("345");
        Long l3 = Long.valueOf("123", 10);
        System.out.println(l1 + ", " + l2 + ", " + l3);

        long l4 = Long.parseLong("1234");
        long l5 = Long.parseLong("1234", 10);
        System.out.println(l4 + ", " + l5);

        System.out.println(l1.byteValue());
        System.out.println(l1.shortValue());
        System.out.println(l1.intValue());
        System.out.println(l1.longValue());
        System.out.println(l1.floatValue());
        System.out.println(l1.doubleValue());

        String l = Long.toString(l1);
        System.out.println(l);
    }

    public static void FloatDemo() {
        Float f1 = Float.valueOf(1.23F);
        Float f2 = Float.valueOf("1.32");
        System.out.println(f1 + ", " + f2);

        float f3 = Float.parseFloat("34.67");
        System.out.println(f3);

        System.out.println(f1.byteValue());
        System.out.println(f1.shortValue());
        System.out.println(f1.intValue());
        System.out.println(f1.longValue());
        System.out.println(f1.floatValue());
        System.out.println(f1.doubleValue());

        String f = Float.toString(f1);
        System.out.println(f);
    }

    public static void DoubleDemo() {
        Double aDouble1 = 2.3;
        Double aDouble2 = new Double("3.14");

        System.out.println(aDouble1);
        System.out.println(aDouble2);

        Double d1 = Double.valueOf(2.79);
        Double d2 = Double.valueOf("3.78");

        System.out.println(d1);
        System.out.println(d2);

        double d3 = Double.parseDouble("4.5");
        System.out.println(d3);

        System.out.println(aDouble1.byteValue());
        System.out.println(aDouble1.shortValue());
        System.out.println(aDouble1.intValue());
        System.out.println(aDouble1.longValue());
        System.out.println(aDouble1.floatValue());
        System.out.println(aDouble1.doubleValue());

        String d = Double.toString(2.31);
        System.out.println(d);
    }

    public static void BooleanDemo() {
        Boolean aBoolean = Boolean.valueOf("true");
        Boolean bBoolean = Boolean.valueOf(false);
        System.out.println(aBoolean + ", " + bBoolean);

        boolean cBoolean = Boolean.parseBoolean("true");
        System.out.println(cBoolean);

        String b = Boolean.toString(false);
        System.out.println(b);
    }
}
