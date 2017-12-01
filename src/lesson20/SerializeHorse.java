package lesson20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeHorse {
    public static void main(String[] args) {
        Halter halter = new Halter();
        Horse horse = new Horse(halter);
        serialize(horse);
        Horse deserializeHorse = deserialize();
    }

    public static Horse serialize(Horse horse) {
        horse = null;
        try (FileOutputStream fs = new FileOutputStream("test.txt");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }

    private static Horse deserialize() {
        Horse horse = null;
        try (FileInputStream fis = new FileInputStream("test.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }
}
