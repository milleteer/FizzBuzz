package CE_LuckyTickets;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by gkoles on 2016.02.06..
 */
public class MainTest {

    @Test
    public void testTrue(){

        String GoodBaseString = "4";
        assertTrue(Main.CalculateLuckyNumbers(GoodBaseString));

    }
    @Test
    public void testFalse(){

        String  BadBaseString = "3";
        assertFalse(Main.CalculateLuckyNumbers(BadBaseString));

    }

    @Test
    public void testFillArrays(){

        List<String> testList = Main.fillArrays(2);

        assertTrue(testList.size() == 100);

    }


    @Test
    public void testSizeOfSplitFormattedFullNumbersArray(){

        List<String> testList = Main.fillArrays(2);

        List<Pair> Pairs = Main.splitFormattedFullNumbersArray(testList);

        assertTrue(Pairs.size() == 100);


    }
    @Test
    public void testSplitFormattedFullNumbersArray(){

        List<String> testList = new ArrayList<String>();

        testList.add("0000");
        testList.add("1111");
        testList.add("2222");
        testList.add("1234");

        List<Pair> Pairs = Main.splitFormattedFullNumbersArray(testList);

        assertTrue(Pairs.get(0).compareLR());
        assertTrue(Pairs.get(1).compareLR());
        assertTrue(Pairs.get(2).compareLR());
        //assertFalse(Pairs.get(3).compareLR());
    }

}
