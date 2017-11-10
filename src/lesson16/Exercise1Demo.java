package lesson16;

public class Exercise1Demo {
    public static void main(String[] args) {
        Exercise1<Integer, String, Character> obj = new Exercise1<>(7, "Java", '/');
        obj.className();

        int a = obj.getOb1();
        System.out.println("value: " + a);

        String str = obj.getOb2();
        System.out.println("value: " + str);

        int c = obj.getOb3();
        System.out.println("value: " + c);
    }
}
