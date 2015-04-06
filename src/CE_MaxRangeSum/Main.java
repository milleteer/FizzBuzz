package CE_MaxRangeSum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Greg Koles on 6/04/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Greg Koles\\IdeaProjects\\FizzBuzz\\src\\CE_MaxRangeSum\\input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);
        }
    }

    private static int Days;

    private static void processLine(String line) {

        Scanner scanner = new Scanner(line);

        scanner.useDelimiter(";");
        if (scanner.hasNextInt())setDays(scanner.nextInt());

        scanner.skip(";");
        calculateMovingSum(scanner.nextLine());


    }

    private static void calculateMovingSum(String s) {

        Scanner scanner = new Scanner(s);
        int sum = 0;

        // calcs the sum of first N numbers
        // movement to add
       while (scanner.hasNextInt() && getDays() > 0){

           sum += scanner.nextInt();
           setDays(getDays() - 1 );

       }

        System.out.println(sum);

    }

    public static int getDays() {
        return Days;
    }

    public static void setDays(int days) {
        Days = days;
    }
}
