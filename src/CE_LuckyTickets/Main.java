package CE_LuckyTickets;

import java.io.*;
import java.util.*;

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
    public static List<Pair> getListOfPairs() {
        return ListOfPairs;
    }
    public static void setListOfPairs(List<Pair> listOfPairs) {
        ListOfPairs = listOfPairs;
    }



    // variables and static values
    private static int Length;
    private static List<String> FormattedFullNumbers = new ArrayList<String>();
    // create list to store pairs
    private static List<Pair> ListOfPairs = new ArrayList<Pair>();



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

        // Reset
        ListOfPairs.clear();
        FormattedFullNumbers.clear();

        // Fill a list of arrays based on half-length
        fillArrays(getLength());

        // Divide into 2 separate arrays
        splitFormattedFullNumbersArray(FormattedFullNumbers);

        // Compare pair by pair
        comparePairByPair(getListOfPairs());

        return true;

    }

    private static void comparePairByPair(List<Pair> ListOfPairs) {

        // init counter
        int cnt = 0;

        // compare pair-by-pair
        for (Pair pair: ListOfPairs){

            if (pair.compareLR())cnt++;

        }
        System.out.println(cnt + " is the number of Lucky Tickets");
    }

    protected static List<Pair> splitFormattedFullNumbersArray(List<String> FormattedFullNumbers) throws IndexOutOfBoundsException {

        // fill the list with pairs
        for (String i: FormattedFullNumbers) {
            ListOfPairs.add(new Pair(2,2));
        }

        return ListOfPairs;
    }

    protected static List<String> fillArrays(int Length) throws ArrayIndexOutOfBoundsException{

        List<Integer> FullNumbers = new ArrayList<Integer>();

        int NumOfNumbers = (int) Math.pow(10,Length);

        // original full values
        for (int i = 0; i < NumOfNumbers; i++) {
            FullNumbers.add(i);
        }

        // cast with leading zeros
        for (int i : FullNumbers){
            FormattedFullNumbers.add(String.format("%0" + Length + "d", i));
        }

        return FormattedFullNumbers;
    }

    private static boolean CheckParity(String next) {
        int base = Integer.valueOf(next);

        if (base % 2 == 0) return true;
        else return false;

    }


}
