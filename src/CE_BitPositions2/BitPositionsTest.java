package CE_BitPositions2;

import org.junit.Test;

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
    public void createPatternTest(){

        //10
        Main.setNumber(2);
        Main.setPosition1(1);
        Main.setPosition2(2);

    assertThat("0", is(Main.createPattern(Main.getPosition1())));
    assertThat("1", is(Main.createPattern(Main.getPosition2())));

        Main.setPosition2(3);

        assertThat(null, is(Main.createPattern(Main.getPosition2())));

    }

}
