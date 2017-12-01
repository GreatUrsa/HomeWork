package lesson19;

import java.io.*;

/**
 * Написать класс, который копирует содержимое из одного файла в другой.
 * Используем классы BufferedReader, FileReader, BufferedWriter , FileWriter.
 */
public class BuffereReaderWriterDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src//lesson19//io//tasks"));
             BufferedWriter bw = new BufferedWriter((new FileWriter("src//lesson19//io//tasks_copy")))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
