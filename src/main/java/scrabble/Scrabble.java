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
        if (letter.equals("a")) {
            result += 1;
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




