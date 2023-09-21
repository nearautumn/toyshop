package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {

    private String path;

    public FileSaver() {
        path = "Winner.txt";
    }

    public void saveFile(String line) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write(line);
            System.out.println("Файл сохранен успешно");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла!");
        }
    }
}
