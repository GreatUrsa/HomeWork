package lesson20;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private Halter halter;

    public Horse(Halter halter) {
        this.halter = halter;
    }
}
