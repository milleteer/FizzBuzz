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
    public static void main(String[] args) throws Exception {
       // File file = new File("src/CE_LowerCase/input.txt");
       File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null){
            line = line.trim();

            try {
                processLine(line);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void processLine(String s) throws Exception {

        Scanner scanner = new Scanner(s);

        List<String> list = new ArrayList<String>();

        scanner.useDelimiter(" ");

        while (scanner.hasNext()) {

            list.add(scanner.next());

        }


        System.out.println(toLowerCase(list));
    }

    private static String toLowerCase(List<String> s) throws Exception {

        String z = "";

        try {
            for (int i = 0; i < s.size(); i++) {

                z += s.get(i).toLowerCase();
                z += ' ';

            }

            return z;
        }
        catch (NullPointerException e){
            return null;
        }
    }

    }