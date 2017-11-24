package lesson12;

public class DoubleDemo {
    public static void main(String[] args) {
        Double aDouble1 = 2.3;
        Double aDouble2 = new Double("d2");

        System.out.println(aDouble1);
        System.out.println(aDouble2);

        Double d1 = Double.valueOf(3.14);

        System.out.println(aDouble1.byteValue());
        System.out.println(aDouble1.shortValue());
        System.out.println(aDouble1.intValue());
        System.out.println(aDouble1.longValue());
        System.out.println(aDouble1.floatValue());

        String d = Double.toString(2.78);
    }
}
