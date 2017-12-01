package lesson21;

public class NewThreadDemo {
    public static void main(String[] args) {
        NewThread newThread1 = new NewThread();
        NewThread newThread2 = new NewThread();
        NewThread newThread3 = new NewThread();

        newThread1.start();
        newThread2.start();
        newThread3.start();
    }
}
