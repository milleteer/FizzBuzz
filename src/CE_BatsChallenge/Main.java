package CE_BatsChallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/gkoles/IdeaProjects/FizzBuzz/src/CE_BatsChallenge/input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            processLine(line);
        }
    }

    protected static int Distance;
    protected static int Length;
    private static int NumOfBatsOnWire;
    private static int FirstOccupiedPos;

    private static void processLine(String s) throws IOException {

        Scanner scanner = new Scanner(s);

        List<Integer> list = new ArrayList<Integer>();

        scanner.useDelimiter(" ");

        while (scanner.hasNextInt()) {

            list.add(scanner.nextInt());

        }

        setParams(list);
        int result = CalculateNumberOfBats();

        System.out.println(Integer.toString(result));

    }

    private static int CalculateNumberOfBats() {

        if (NumOfBatsOnWire == 0) {

            return MaxBats();
        }
        else {

            return CalculateFromFirstPos();

        }

    }

    private static int CalculateFromFirstPos(){

        try {

            if ( ( FirstOccupiedPos - 6 ) % Distance  == 0 ){

                return ( MaxBats() - NumOfBatsOnWire );

            }
            else{

                return ( MaxBats() - 1 - NumOfBatsOnWire );

            }
        }
        catch (ArithmeticException e){

            System.out.println("Ilegal argument");
            return 0;
        }

    }

    protected static int MaxBats() {

        if (Length < 12 || Length < 0 || Distance < 0 || NumOfBatsOnWire < 0 ) return 0;
        else return ( ( Length - 12 ) / Distance ) + 1;

    }


    private static void setParams(List<Integer> list) {

        //check if negative values are present

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()){

            if (it.next() < 0){

                throw new IllegalArgumentException("All arguments must be greater than 0");

            }

        }


        Length = list.get(0);
        Distance = list.get(1);
        NumOfBatsOnWire = list.get(2);

        if(list.size() > 3){

            FirstOccupiedPos = list.get(3);

        }
        else {

            FirstOccupiedPos = 0;

        }
    }
}
