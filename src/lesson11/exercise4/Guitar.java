package lesson11.exercise4;

public class Guitar implements Instrument {
    private int stringNumber;

    public Guitar(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return stringNumber == guitar.stringNumber;
    }

    @Override
    public int hashCode() {
        return stringNumber;
    }

    @Override
    public String toString() {
        return "Характеристики гитары: " +
                "количество струн - " + stringNumber +
                '.';
    }
}
