package lesson11.exercise4;

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Играет труба.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return diameter == trumpet.diameter;
    }

    @Override
    public int hashCode() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Характеристики гитары: " +
                "диаметр трубы " + diameter +
                " мм.";
    }
}
