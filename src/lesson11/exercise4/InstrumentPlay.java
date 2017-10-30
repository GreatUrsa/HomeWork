package lesson11.exercise4;

public class InstrumentPlay {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Drum("большой эстрадный: 580х350 мм");
        instruments[1] = new Trumpet(123);
        instruments[2] = new Guitar(4);
        for (Instrument instrument : instruments) {
            instrument.play();
            System.out.println(instrument);
        }
    }
}
