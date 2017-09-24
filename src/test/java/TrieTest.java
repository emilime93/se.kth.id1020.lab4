import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


public class TrieTest {

    Trie trieOne;
    Trie trieTwo;

    @Before
    public void setUp() throws Exception {
        trieOne = new Trie();
        trieOne.put("joar");
        trieOne.put("bulle");
        trieOne.put("bus");
        trieOne.put("buss");
        trieOne.put("buss");

        trieTwo = new Trie();
        trieTwo.put("sea");
        trieTwo.put("shells");
        trieTwo.put("she");
        trieTwo.put("sells");
        trieTwo.put("joar");
        trieTwo.put("rex");
        trieTwo.put("resa");
    }

    @After
    public void tearDown() throws Exception {
        trieOne = null;
        trieTwo = null;
    }

    @Test
    public void put() throws Exception {
    }

    @Test
    public void getValue() throws Exception {
    }

    @Test
    public void count() throws Exception {
        int expectedResult = 4;
        int calculatedRedult = trieOne.count("bu");
        assertEquals("TrieOne", expectedResult, calculatedRedult);

        expectedResult = 4;
        calculatedRedult = trieTwo.count("s");
        assertEquals("s", expectedResult, calculatedRedult);

        expectedResult = 2;
        calculatedRedult = trieTwo.count("se");
        assertEquals("se", expectedResult, calculatedRedult);

        expectedResult = 2;
        calculatedRedult = trieTwo.count("re");
        assertEquals("re", expectedResult, calculatedRedult);

        expectedResult = 1;
        calculatedRedult = trieTwo.count("jo");
        assertEquals("jo", expectedResult, calculatedRedult);

    }

    @Test
    public void distinct() throws Exception {
        int expectedResult = 3;
        int calculatedRedult = trieOne.distinct("bu");
        assertEquals(expectedResult, calculatedRedult);

        expectedResult = 4;
        calculatedRedult = trieTwo.distinct("s");
        assertEquals(expectedResult, calculatedRedult);

        expectedResult = 2;
        calculatedRedult = trieTwo.distinct("re");
        assertEquals(expectedResult, calculatedRedult);

        expectedResult = 1;
        calculatedRedult = trieTwo.distinct("j");
        assertEquals(expectedResult, calculatedRedult);
    }

}