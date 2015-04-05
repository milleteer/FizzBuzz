import java.io.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
            File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();

               processLine(line);
            }
        }

        protected static int Fizz;
        protected static int Buzz;
        protected static int CountTo;

    public static void processLine(String s) throws IOException {

        Scanner scanner = new Scanner(s);

        scanner.useDelimiter(" ");

        if (scanner.hasNext()) {

            Fizz = Integer.valueOf(scanner.next());
            Buzz = Integer.valueOf(scanner.next());
            CountTo = Integer.valueOf(scanner.next());

        }

        FizzBuzzPerLine(Fizz,Buzz,CountTo);
        System.out.println();
    }

    public static boolean Fizz(int fizz, int i){

        boolean result = false;
        if(i % fizz == 0){

            result = true;

            return result;
        }
        else return result;

    }

    public static boolean Buzz(int buzz, int i){

        boolean result = false;
        if(i % buzz == 0){

            result = true;

            return result;
        }
        else return result;

    }

    public static String FizzBuzzPerNumber(int Fizz, int Buzz, int Number) {


        boolean result = Buzz(Buzz,Number) && Fizz(Fizz, Number);

        if(result == true)return "FB";
        else if(Buzz(Buzz, Number)) return "B";
        else if(Fizz(Fizz, Number)) return "F";
        else {
            return Integer.toString(Number);
        }
    }

    public static void FizzBuzzPerLine(int Fizz, int Buzz, int CountTo) {

        for (int i = 1; i <= CountTo; i++) {

            String result = FizzBuzzPerNumber(Fizz, Buzz, i);
            System.out.print(result + " ");

        }
    }
}
