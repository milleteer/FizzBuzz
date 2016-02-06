package CE_LuckyTickets;

import java.io.*;
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
    public static int getHalfLength() {
        return HalfLength;
    }

    public static void setHalfLength(int halfLength) {
        HalfLength = halfLength / 2;
    }

    // variables and static values
    private static int HalfLength;


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
        setHalfLength(Integer.valueOf(next));
        return true;

    }

    private static boolean CheckParity(String next) {
        int base = Integer.valueOf(next);

        if (base % 2 == 0) return true;
        else return false;

    }
}
