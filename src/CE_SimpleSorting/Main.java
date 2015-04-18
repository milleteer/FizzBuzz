package CE_SimpleSorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("src/CE_SimpleSorting/input.txt");
        //File file = new File(args[0]);

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);

        }
    }

    private static void processLine(String s) throws IOException {

        Scanner scanner = new Scanner(s);
        scanner.useDelimiter(",");

        if (scanner.hasNextInt()){

        }


    }

}
