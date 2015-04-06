package CE_SumOfInts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Greg Koles on 6/04/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        File file = new File("C:\\Users\\Greg Koles\\IdeaProjects\\FizzBuzz\\src\\CE_SumOfInts\\input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);
        }

        calculateSum();

        //System.out.println("Size of the list is: " + list.size());
        //System.out.println(list);
    }

    private static int calculateSum() {

        int sum = 0;

        for (int ListItem: list){
            sum += ListItem;
        }

        System.out.println(sum);
        return sum;

    }


    private static List<Integer> list = new ArrayList<Integer>();

    private static void processLine(String line) throws InputMismatchException{

        Scanner scanner = new Scanner(line);

        if (scanner.hasNextInt())list.add(scanner.nextInt());
    }

}
