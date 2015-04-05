package CE_BatsChallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
            File file = new File("C:\\Users\\Greg Koles\\IdeaProjects\\FizzBuzz\\src\\CE_BatsChallenge\\input.txt");
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();

               processLine(line);
            }
        }

        protected static int Distance;
        protected static int Length;
        protected static int NumOfBatsOnWire;
        protected static int FirstOccupiedPos;

    public static void processLine(String s) throws IOException {

        Scanner scanner = new Scanner(s);

        scanner.useDelimiter(" ");

         while (scanner.hasNext()) {

            Length = Integer.valueOf(scanner.next());
            Distance = Integer.valueOf(scanner.next());
            NumOfBatsOnWire = Integer.valueOf(scanner.next());
            FirstOccupiedPos = Integer.valueOf(scanner.next());


            System.out.println(scanner.next());


        }

      //  FizzBuzzPerLine(Fizz,Buzz,CountTo);
        System.out.println();
    }

}
