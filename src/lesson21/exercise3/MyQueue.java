package lesson21.exercise3;

import java.util.Queue;

public class MyQueue {
    private Queue<Integer> myQueue;

    public MyQueue(Queue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    public synchronized int get() {
        while (myQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer detail = myQueue.poll();
        System.out.println("Пoлyчeнo: " + detail);
        return detail;
    }

    public synchronized void put(int n) {
        myQueue.add(n);
        System.out.println("Oтпpaвлeнo: " + n);
        notifyAll();
    }
}
