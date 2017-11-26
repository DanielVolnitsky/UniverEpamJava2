package tasks;

import tasks.task6_23_11_2017.stringTask.entities.FileHelper;
import tasks.task6_23_11_2017.stringTask.entities.Symbol;
import tasks.task6_23_11_2017.stringTask.entities.Word;
import tasks.task6_23_11_2017.stringTask.entities.WordSorter;

import java.io.File;
import java.util.Arrays;

public class Main {

    final static String filePath = "src\\main\\java\\tasks\\task6_23_11_2017\\stringTask\\additional\\text";

    public static void main(String[] args) {
        File file = new File(filePath);
        String text = new String(FileHelper.getFileBytes(file.getAbsolutePath()));

        WordSorter ws = new WordSorter(new Symbol('a'), text);
        Word[] sorted = ws.getSortedBySymbolFrequency();

        System.out.println(Arrays.toString(sorted));
    }
}