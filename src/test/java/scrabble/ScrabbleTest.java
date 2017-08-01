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
        assertEquals(expected, testScrabble.calculateScore("e"));
    }

    @Test
    public void calculateScore_returnsScoreForDoubleLetter_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("aa"));
    }

    @Test
    public void calculateScore_returnsScoreForTwoDifferentLetters_3() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("do"));
    }

    @Test
    public void calculateScore_returnsScoreWithLettersFromAllCategories_33 () throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 33;
        assertEquals(expected, testScrabble.calculateScore("qjkfbda"));
    }

    @Test
    public void calculateScore_returnsScoreForWordWithMixedCase_33() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 33;
        assertEquals(expected, testScrabble.calculateScore("QjKfBdA"));
    }

    @Test
    public void calculateScore_returnsScoreForLongScrabbleWord() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 41;
        assertEquals(expected, testScrabble.calculateScore("OXYPHENBUTAZONE"));
    }
}