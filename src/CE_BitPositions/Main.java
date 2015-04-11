package CE_BitPositions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("src\\CE_BitPositions\\input.txt");
        //File file = new File(args[0]);

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);
            System.out.println();
        }
    }

    private static int Number1;
    private static int Number2;
    private static int Position;


    private static void processLine(String s) throws IOException {

        Scanner scanner = new Scanner(s);
        scanner.useDelimiter(",");

        if (scanner.hasNextInt()){

            setNumber1(scanner.nextInt());
            setPosition(scanner.nextInt());
            setNumber2(scanner.nextInt());

        }

        System.out.println("Number1 is:" + getNumber1());
        System.out.println("Number2 is: " + getNumber2());
        System.out.println("Position to compare is: " + getPosition());

       boolean result = ComparePositions(TranslateTo2(getNumber1()),TranslateTo2(getNumber2()));

        System.out.println("The bit position match is: " + result);


    }

    protected static String TranslateTo2(int i) {

        if (i < 0) return "";

        else{

            System.out.println("The number " + i + " in binary is: " + Integer.toString(i, 2));
            return Integer.toString(i, 2);
        }

    }

    protected static boolean ComparePositions(String number1, String number2) {

        String s1 = new StringBuilder(number1).reverse().toString();
        String s2 = new StringBuilder(number2).reverse().toString();

        String patternChar = String.valueOf(s1.charAt(getPosition() - 1 ));
        String matchChar = String.valueOf(s2.charAt(getPosition() - 1));

        Pattern pattern = Pattern.compile(patternChar);

        Matcher matcher = pattern.matcher(matchChar);

        return matcher.matches();

    }


    public static int getNumber1() {
        return Number1;
    }

    public static void setNumber1(int number1) {
        Number1 = number1;
    }

    public static int getNumber2() {
        return Number2;
    }

    public static void setNumber2(int number2) {
        Number2 = number2;
    }

    public static int getPosition() {
        return Position;
    }

    public static void setPosition(int position) {
        Position = position;
    }
}
