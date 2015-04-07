import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by gkoles on 2015.03.24..
 */

@SuppressWarnings("DefaultFileTemplate")
class ReadWithScanner {

    public final Path theFilePath;

    private static int Fizz;
    private static int Buzz;
    private static int CountTo;

    public ReadWithScanner(){

        theFilePath = Paths.get("C:\\Users\\gkoles\\IdeaProjects\\FizzBuzz\\src\\input.txt");

    }

    public final void processLineByLine() throws IOException {
        Scanner scanner = new Scanner(theFilePath);

        while (scanner.hasNextLine()){

            this.processLine(scanner.nextLine());


            // here comes the FizzBuzz per line

            FizzBuzz fb = new FizzBuzz();
            fb.FizzBuzzPerLine(Fizz,Buzz,CountTo);
            System.out.println(" ");

        }
    }

    void processLine(String s) {

        Scanner scanner = new Scanner(s);

        scanner.useDelimiter(" ");

        if(scanner.hasNext()) {

            Fizz = Integer.valueOf(scanner.next());
            Buzz = Integer.valueOf(scanner.next());
            CountTo = Integer.valueOf(scanner.next());

        }



    }


}
