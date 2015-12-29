package CE_RemoveCharacters;

/**
 * Created by gkoles on 2015.12.29..
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveCharactersTest {

    @Test
    public void ListToRemoveCharactersTest(){

        List<String> list = new ArrayList<String>();

        list.add(0,"1");
        list.add(1,"a");
        list.add(2,"b");
        list.add(3,"cdef");

        System.out.println(Main.SeperateToChars(list.get(list.size()-1)));

    }


}
