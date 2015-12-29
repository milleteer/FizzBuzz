package CE_LowerCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/CE_LowerCase/input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);
        }
    }

    private static void processLine(String s) throws IOException {

        Scanner scanner = new Scanner(s);

        List<String> list = new ArrayList<String>();

        scanner.useDelimiter(" ");

        while (scanner.hasNext()) {

            list.add(scanner.next());

        }


        System.out.println(list);
    }


    }
