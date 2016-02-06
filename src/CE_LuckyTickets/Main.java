package CE_LuckyTickets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by gkoles on 2016.02.06..
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/CE_LuckyTickets/input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        try {
            while ((line = buffer.readLine()) != null) {
                line = line.trim();

                try {
                    processLine(line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getters and Setters
    public static int getLength() {
        return Length;
    }

    public static void setLength(int halfLength) {
        Length = halfLength;
    }

        // variables and static values
    private static int Length;



    // actual functions
    private static void processLine (String line){

        Scanner scanner = new Scanner(line);

        while (scanner.hasNext()) {
            CalculateLuckyNumbers(scanner.next());
        }

    }

    protected static boolean CalculateLuckyNumbers(String next) {

        // if the input number is not even, let's skip it
        if(!CheckParity(next))return false;

        // Set half-length
        setLength(Integer.valueOf(next));

        // Fill a list of arrays based on half-length
        fillArrays(getLength());

        return true;

    }

    protected static List<int[]> fillArrays(int Length) throws ArrayIndexOutOfBoundsException{

        List<Integer> FullNumbers = new ArrayList<Integer>();
        List<String> FormattedFullNumbers = new ArrayList<String>();
        int NumOfNumbers = (int) Math.pow(10,Length);

        // original full values
        for (int i = 0; i < NumOfNumbers; i++) {
            FullNumbers.add(i);
        }

        // cast with leading zeros
        for (int i : FullNumbers){
            FormattedFullNumbers.add(String.format("%0" + Length + "d", i));
        }

        System.out.println(FormattedFullNumbers);


        return null;
    }

    private static boolean CheckParity(String next) {
        int base = Integer.valueOf(next);

        if (base % 2 == 0) return true;
        else return false;

    }


}
