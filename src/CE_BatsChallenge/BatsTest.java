package CE_BatsChallenge;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Greg Koles on 5/04/2015.
 */
public class BatsTest {

    @Test

    public void TestMaxBats(){

        Main m = new Main();

        m.Distance = 12;
        m.Length = 24;
        Assert.assertEquals(2, m.MaxBats());

    }

    @Test
    public void CalculateFromFirstPosTest(){



    }
}
