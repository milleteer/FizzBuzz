package CE_MaxRangeSum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Greg Koles on 6/04/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src\\CE_MaxRangeSum\\input.txt");

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);
        }
    }

    private static int Days;
    private static int FinalSumPerLine;
    private static boolean FirstFlag;

    private static void processLine(String line) {

        Scanner scanner = new Scanner(line);

        scanner.useDelimiter(";");
        if (scanner.hasNextInt())setDays(scanner.nextInt());

        scanner.skip(";");
        calculateMovingSum(scanner.nextLine());


    }

    private static void calculateMovingSum(String s) {

        Scanner scanner = new Scanner(s);
        scanner.useDelimiter(" ");

        LinkedList<Integer> list = new LinkedList<Integer>();

        //play with this
        setFirstFlag(true);

        // calcs the sum of first N numbers
        // movement to add
       while (scanner.hasNextInt()){

           if (getDays() > 0) {

               list.add(scanner.nextInt());
               setDays(getDays() - 1);

               System.out.println(list);

           }
           else {

               int sum = calculateSum(list);
               compareSums(sum);

               list.remove();
               list.add(scanner.nextInt());

               System.out.println(list);


           }

       }

        // calc for the last set
        int sum = calculateSum(list);
        compareSums(sum);

        System.out.println("The final sum is: " + getFinalSumPerLine());

    }

    private static void compareSums(int sum) {

        if (sum > getFinalSumPerLine() && !getFirstFlag())setFinalSumPerLine(sum);

    }

    private static int calculateSum(LinkedList<Integer> list ) {

        int sum = 0;

        for (int item : list){

            sum += item;

        }

        return sum;

    }

    public static int getDays() {
        return Days;
    }

    public static void setDays(int days) {
        Days = days;
    }

    public static int getFinalSumPerLine() {
        return FinalSumPerLine;
    }

    public static void setFinalSumPerLine(int finalSumPerLine) {
        FinalSumPerLine = finalSumPerLine;
    }

    public static void setFirstFlag(boolean firstFlag) {
        FirstFlag = firstFlag;
    }

    private static boolean getFirstFlag() {

        return FirstFlag;

    }
}
