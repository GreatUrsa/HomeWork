package lesson20;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private Halter halter;

    public Horse(Halter halter) {
        this.halter = halter;
    }

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return halter != null ? halter.equals(horse.halter) : horse.halter == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (halter != null ? halter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "halter=" + halter +
                "} " + super.toString();
    }
}
