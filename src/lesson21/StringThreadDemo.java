package lesson21;

public class StringThreadDemo {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("a");
        StringThread thread1 = new StringThread(s);
        StringThread thread2 = new StringThread(s);
        StringThread thread3 = new StringThread(s);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
