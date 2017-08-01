package scrabble;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {

    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }

    @Test
    public void calculateScore_returnsScoreForDoubleLetter_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("aa"));
    }
}