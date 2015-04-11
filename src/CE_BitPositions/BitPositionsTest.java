package CE_BitPositions;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BitPositionsTest {

    @Test
    public void TranslateTo2Test(){

        assertThat("0", is(Main.TranslateTo2(0)));
        assertThat("100", is(Main.TranslateTo2(4)));
        assertThat("111", is(Main.TranslateTo2(7)));
        assertThat("", is(Main.TranslateTo2(-1)));

    }

    @Test
    public void ComparePositionsTest(){

        Main.setPosition(2);

        assertTrue(Main.ComparePositions("000", "001"));
        assertFalse(Main.ComparePositions("000", "010"));

    }

}
