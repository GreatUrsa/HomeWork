package lesson11.exercise4;

public class InstrumentPlay {
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[3];
        instrument[0] = new Drum("большой эстрадный: 580х350 мм");
        instrument[1] = new Trumpet(123);
        instrument[2] = new Guitar(4);
        for (Instrument instruments : instrument) {
            instruments.play();
            System.out.println(instruments);
        }
    }
}
