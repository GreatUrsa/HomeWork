package lesson20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeHorse {
    public static void main(String[] args) {
        Halter halter = new Halter("Седло английского типа");
        Horse horse = new Horse(halter);
        serialize(horse);
        Horse deserializeHorse = deserialize();
    }

    public static void serialize(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream("src//lesson20//test.txt");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Horse deserialize() {
        Horse horse = null;
        try (FileInputStream fis = new FileInputStream("src//lesson20//test.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }
}
