import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkDownParseTest {
    private static MarkdownParse test;
    private static MarkdownParseWeek7 week7;
    private static ArrayList<String> expected,snip1Exp,snip2Exp,snip3Exp;

    @Before
    public void SetUp(){
        expected = new ArrayList<String>();
        snip1Exp = new ArrayList<String>();
        snip2Exp = new ArrayList<String>();
        snip3Exp = new ArrayList<String>();

        snip1Exp.add("`google.com");

        snip2Exp.add("a.com");
        snip2Exp.add("a.com(())");
        snip2Exp.add("example.com");

        snip3Exp.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
    }

    @Test
    public void addition(){
        assertEquals(2, 1+1);
    }

    //Lab 4 Tests Begin here

    @Test
    public void MyMarkdownSnippet1()throws IOException{
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        assertEquals(snip1Exp, test.getLinks(content));
    }
    @Test
    public void MyMarkdownSnippet2()throws IOException{
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        assertEquals(snip2Exp, test.getLinks(content));
    }
    @Test
    public void MyMarkdownSnippet3()throws IOException{
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        assertEquals(snip3Exp, test.getLinks(content));
    }
    @Test
    public void Week7MarkdownSnippet1()throws IOException{
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        assertEquals(snip1Exp, week7.getLinks(content));
    }
    @Test
    public void Week7MarkdownSnippet2()throws IOException{
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        assertEquals(snip2Exp, week7.getLinks(content));
    }
    @Test
    public void Week7MarkdownSnippet3()throws IOException{
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        assertEquals(snip3Exp, week7.getLinks(content));
    }

    //Lab 4 Tests End here (---------------------------)

    @Test
    public void getLinks_testfile() throws IOException{
        expected.add("https://something.com");
        expected.add("some-page.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
    @Test
    public void getLinks_BreakMyComp() throws IOException{
        expected.add("https://something.com");
        expected.add("some-thing.html");
        expected.add("user.html");
        Path fileName = Path.of("BreakMyComp.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
    @Test
    public void getLinks_BreakMyComp_2() throws IOException{
        Path fileName = Path.of("BreakMyComp_2.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
    @Test
    public void getLinks_BreakMyComp_3() throws IOException{
        Path fileName = Path.of("BreakMyComp_3.md");
        String content = Files.readString(fileName);
        assertEquals(expected,test.getLinks(content));
    }
}
