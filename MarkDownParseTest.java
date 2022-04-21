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
    public void getLinks_testfile() throws IOException{
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
    @Test
    public void getLinks_BreakMyComp() throws IOException{
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        expected.add("user.html");
        Path fileName = Path.of("BreakMyComp.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
    @Test
    public void getLinks_BreakMyComp_2() throws IOException{
        ArrayList<String> expected = new ArrayList<String>();
        Path fileName = Path.of("BreakMyComp_2.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
    @Test
    public void getLinks_BreakMyComp_3() throws IOException{
        ArrayList<String> expected = new ArrayList<String>();
        Path fileName = Path.of("BreakMyComp_3.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
}
