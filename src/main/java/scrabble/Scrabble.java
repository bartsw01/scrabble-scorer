package scrabble;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

    public Integer calculateScore(String letter) {
        Integer result = 0;
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || (letter.equals("o") || letter.equals("u") || letter.equals("l") || (letter.equals("n") || letter.equals("r") || letter.equals("s") || letter.equals("t") ))) {
            result += 1;
        } else if(letter.equals("aa")) {
            result += 2;
        } else if(letter.equals("do")){
            result += 3;

        }
        return result;
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




