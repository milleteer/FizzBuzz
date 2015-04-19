package CE_SimpleSorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


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

        while (scanner.hasNextLine()){

            Scanner sc = new Scanner(scanner.nextLine());
            sc.useDelimiter(" ");

            ArrayList<Double> list = new ArrayList<Double>();

            while (sc.hasNextDouble()){

                list.add(sc.nextDouble());

            }

            //sort
            Collections.sort(list);


            // enlist the items
            for (double i : list){

                System.out.print(String.format("%.3f",i) + " ");


            }
            //skip row
            System.out.println();

        }



    }

}
