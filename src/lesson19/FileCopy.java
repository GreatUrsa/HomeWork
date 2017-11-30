package lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Переписать класс FileCopy:
 * Добавить блок try-with-resources.
 * Убрать throws IOException  из объявления main() метода. И добавить соответствующий catch блок.
 */
public class FileCopy {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("src//lesson19//file.txt");
             FileOutputStream fileOut = new FileOutputStream("src//lesson19//copied_file.txt")) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
