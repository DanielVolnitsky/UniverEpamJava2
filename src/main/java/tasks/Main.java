package tasks;

import tasks.helpers.FileHelper;
import tasks.task6_23_11_2017.stringTask.entities.Letter;
import tasks.task6_23_11_2017.stringTask.entities.Word;
import tasks.task6_23_11_2017.stringTask.entities.WordsHelper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    final static String filePath = "src\\main\\java\\tasks\\task6_23_11_2017\\stringTask\\additional\\TextExample";

    public static void main(String[] args) {
        try {
            File file = new File(filePath);
            byte[] fileBytes = FileHelper.getFileBytes(file.getAbsolutePath());

            List<Word> words = new ArrayList<>();
            WordsHelper.fillWordsByByteArray(fileBytes, words);

            System.out.println("Initial words sequence:\n" + words);

            Letter coreLetter = new Letter('a');
            List<Word> sorted = new ArrayList<>(words);
            WordsHelper.sortWordsByLetterFrequency(sorted, coreLetter);

            System.out.println("\nSorted words sequence:\n" + sorted);

        } catch (IllegalArgumentException | IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}