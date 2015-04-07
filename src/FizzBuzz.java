import java.io.IOException;

/**
 * Created by gkoles on 2015.03.23..
 */
@SuppressWarnings("DefaultFileTemplate")
class FizzBuzz {

    public static void main(String[] args) throws IOException {

        ReadWithScanner rw = new ReadWithScanner();
        rw.processLineByLine();

    }

     public boolean Fizz(int fizz, int i){

         return i % fizz == 0;

     }

    public boolean Buzz(int buzz, int i){

        return i % buzz == 0;

    }

    public String FizzBuzzPerNumber(int Fizz, int Buzz, int Number) {


            boolean result = Buzz(Buzz,Number) && Fizz(Fizz, Number);

            if(result)return "FizzBuzz";
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
