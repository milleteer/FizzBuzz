package CE_BitPositions2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("src/CE_BitPositions2/input.txt");
        //File file = new File(args[0]);

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);

        }
    }

    private static int Number;
    private static int Position1;
    private static int Position2;


    private static void processLine(String s) throws IOException {

        Scanner scanner = new Scanner(s);
        scanner.useDelimiter(",");

        if (scanner.hasNextInt()){

            setNumber(scanner.nextInt());
            setPosition1(scanner.nextInt());
            setPosition2(scanner.nextInt());

        }

        /*System.out.println("Number1 is:" + getNumber());
        System.out.println("Position1 to compare is: " + getPosition1());
        System.out.println("Position2 to compare is: " + getPosition2());*/

       boolean result = ComparePositions(getPosition1(), getPosition2());

      /*  System.out.println("The bit position match is: " + result);*/


    }

    protected static String TranslateTo2(int i) {

        if (i < 0) return "";

        else{

           return Integer.toString(i, 2);
        }

    }

    protected static String createPattern(int number){

        try{

            String s = new StringBuilder(TranslateTo2(getNumber())).reverse().toString();

           // System.out.println(String.valueOf(s.charAt(number - 1)));
            return String.valueOf(s.charAt(number - 1));

        }
        catch (StringIndexOutOfBoundsException e){

            System.out.println("Out of bounds index");
            return null;

        }

    }

    protected static boolean ComparePositions(int position1, int position2){

        try{

           // System.out.println("The number in binary: " + TranslateTo2(getNumber()));

            Pattern pattern = Pattern.compile(createPattern(position1));

            Matcher matcher = pattern.matcher(createPattern(position2));

            System.out.println(matcher.matches());
            return matcher.matches();

        }catch (NullPointerException e){

            System.out.println("false");
            return false;
        }


    }


    public static int getNumber() {
        return Number;
    }

    public static void setNumber(int number) {
        Number = number;
    }

    public static void setPosition2(int position2) {
        Position2 = position2;
    }

    public static int getPosition2() {return Position2;}

    public static int getPosition1() {
        return Position1;
    }

    public static void setPosition1(int position1) {
        Position1 = position1;
    }
}
