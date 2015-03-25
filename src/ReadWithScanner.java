import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by gkoles on 2015.03.24..
 */

public class ReadWithScanner {

    public final Path theFilePath;
    private final static Charset ENCODING = StandardCharsets.UTF_8;

    protected static int Fizz;
    protected static int Buzz;
    protected static int CountTo;

    /**
     * @param FileName
     */
    public ReadWithScanner(String FileName){

        theFilePath = Paths.get(FileName);

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

    public void processLine(String s) throws IOException{

        Scanner scanner = new Scanner(s);

        scanner.useDelimiter(" ");

        if(scanner.hasNext()) {

            Fizz = Integer.valueOf(scanner.next());
            Buzz = Integer.valueOf(scanner.next());
            CountTo = Integer.valueOf(scanner.next());

        }



    }


}
