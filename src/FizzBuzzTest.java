import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class FizzBuzzTest {

    @Test
    public void testMain() throws Exception {

        FizzBuzzTest fbt = new FizzBuzzTest();

        fbt.FizzExists();
        fbt.FizzReturnsWithCorrectValue();
        fbt.FizzBuzzFalseTest();
        fbt.FizzBuzzTrueTest();

    }

    @Test
    public  void FizzExists() throws Exception{

        Method method = FizzBuzz.class.getMethod("Fizz", int.class,int.class);
        method.setAccessible(true);
    }

    @Test
    public void FizzReturnsWithCorrectValue(){

        FizzBuzz fb = new FizzBuzz();

        int input = 0;
        int fizz = 3;

        boolean result = fb.Fizz(fizz,input);

        if(input % fizz == 0){

            Assert.assertEquals(result,true);

        }
        else{

            Assert.assertEquals(result,input);
        }

    }

    @Test
    public void BuzzReturnsCorrectValue(){

        FizzBuzz fb = new FizzBuzz();

        int input = 0;
        int buzz = 5;

        boolean result = fb.Buzz(buzz,input);

        if(input % buzz == 0){

            Assert.assertEquals(result,true);

        }
        else{

            Assert.assertEquals(result,input);
        }
    }

    @Test
    public void FizzBuzzFalseTest(){

        FizzBuzz fb = new FizzBuzz();

        int input = 14;

        String result = fb.FizzBuzzPerNumber(3, 5, input);

        Assert.assertEquals(result,"14");

    }

    @Test
    public void FizzBuzzTrueTest()throws Exception{

        FizzBuzz fb = new FizzBuzz();

        int input = 15;

        String result = fb.FizzBuzzPerNumber(3, 5, input);

        Assert.assertEquals(result,"FizzBuzz");

    }
}