package scrabble;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;



/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {
    public Integer scrabbleScore = 0;

    public Integer calculateScore(String  word) {
        String lowerCaseWord = word.toLowerCase();
        String[] wordArray = lowerCaseWord.split(" ");
        for (String individualLetter : wordArray) {
            if (individualLetter.equals("a") || individualLetter.equals("e") || individualLetter.equals("i") || individualLetter.equals("o") || individualLetter.equals("u") || individualLetter.equals("l") || individualLetter.equals("n") || individualLetter.equals("r") || individualLetter.equals("s") || individualLetter.equals("t")) {
                this.scrabbleScore += 1;
            } else if (individualLetter.equals("d") || individualLetter.equals("g")) {
                this.scrabbleScore += 2;
            } else if (individualLetter.equals("b") || individualLetter.equals("c") || individualLetter.equals("m") || individualLetter.equals("p")) {
                this.scrabbleScore += 3;
            } else if (individualLetter.equals("f") || individualLetter.equals("h") || individualLetter.equals("v") || individualLetter.equals("w") || individualLetter.equals("y")){
                this.scrabbleScore += 4;
            } else if (individualLetter.equals("k")) {
                this.scrabbleScore += 5;
            } else if (individualLetter.equals("j") || individualLetter.equals("x")){
                this.scrabbleScore += 8;
            } else if (individualLetter.equals("q") || individualLetter.equals("z")){
                this.scrabbleScore += 10;

            }
        }   return this.scrabbleScore;
    }
}



//        Map<String, Integer> scrabbleMap = new HashMap<String, Integer>();
//
//
//        scrabbleMap.put("a", 1);
//    scrabbleMap.put("E", 1);
//    scrabbleMap.put("I", 1);
//    scrabbleMap.put("O", 1);
//    scrabbleMap.put("U", 1);
//    scrabbleMap.put("L", 1);
//    scrabbleMap.put("N", 1);
//    scrabbleMap.put("R", 1);
//    scrabbleMap.put("S", 1);
//    scrabbleMap.put("T", 1);




