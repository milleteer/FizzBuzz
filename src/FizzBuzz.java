import java.io.IOException;

/**
 * Created by gkoles on 2015.03.23..
 */
public class FizzBuzz {

    public static void main(String[] args) throws IOException {

        FizzBuzz fb = new FizzBuzz();

        String result1 = fb.FizzBuzzPerNumber(3,5,15);
        String result2 = fb.FizzBuzzPerNumber(3,5,14);

        //System.out.println(result1);
        //System.out.println(result2);


        ReadWithScanner rw = new ReadWithScanner("C:\\Users\\gkoles\\IdeaProjects\\FizzBuzz\\src\\input.txt");
        rw.processLineByLine();

        /*System.out.println(rw.Fizz);
        System.out.println(rw.Buzz);
        System.out.println(rw.CountTo);
*/

    }

     public boolean Fizz(int fizz, int i){

        boolean result = false;
         if(i % fizz == 0){

             result = true;

             return result;
         }
         else return result;

     }

    public boolean Buzz(int buzz, int i){

        boolean result = false;
        if(i % buzz == 0){

            result = true;

            return result;
        }
        else return result;

    }

    public String FizzBuzzPerNumber(int Fizz, int Buzz, int Number) {


            boolean result = Buzz(Buzz,Number) && Fizz(Fizz, Number);

            if(result == true)return "FizzBuzz";
            else if(Buzz(Buzz, Number)) return "Buzz";
            else if(Fizz(Fizz, Number)) return "Fizz";
            else {
                return Integer.toString(Number);
            }
    }

    public void FizzBuzzPerLine(int Fizz, int Buzz, int CountTo) {

        for (int i = 1; i <= CountTo; i++) {

            String result = this.FizzBuzzPerNumber(Fizz, Buzz, i);
            System.out.print(result + " ");

        }
    }
}
