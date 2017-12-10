package lesson21;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
