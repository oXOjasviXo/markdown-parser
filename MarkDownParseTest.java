import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkDownParseTest {
    private static MarkdownParse test;

    @Test
    public void addition(){
        assertEquals(2, 1+1);
    }
    @Test
    public void getLinksTest(){
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
}
