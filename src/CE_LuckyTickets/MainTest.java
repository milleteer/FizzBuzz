package CE_LuckyTickets;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

        List<int[]> list = Main.fillArrays(2);

        assertTrue(list.size() == 100);

    }




}
