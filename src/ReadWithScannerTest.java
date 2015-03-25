import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by gkoles on 2015.03.24..
 */

public class ReadWithScannerTest {

    @Test
    public void ReadWithScannerTestMain() throws Exception{

        ReadWithScannerTest rws = new ReadWithScannerTest();

        rws.FilePathExists();

    }

    @Test
    public void  FilePathExists() throws IOException {

        Path FilePath = Paths.get("C:\\Users\\gkoles\\IdeaProjects\\FizzBuzz\\src\\input.txt");

        ReadWithScanner rs = new ReadWithScanner("C:\\Users\\gkoles\\IdeaProjects\\FizzBuzz\\src\\input.txt");

        Assert.assertEquals(rs.theFilePath, FilePath);

        }
}

