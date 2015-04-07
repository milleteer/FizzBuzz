import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {

        try {
            File file = new File("C:\\Users\\gkoles\\IdeaProjects\\FizzBuzz\\src\\input.txt");
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                String[] lineArray = line.split("\\s");
                if (lineArray.length > 0) {
                    System.out.println(Arrays.toString(lineArray));
                }
            }
        } catch (IOException e) {
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}