import scrabble.Scrabble;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Enter a word to check its Scrabble score.");
        String word = null;
        try {
            word = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scrabble scrabble = new Scrabble();
        System.out.println("The scrabble score for " + word + " is " + scrabble.calculateScore(word)+ ".");
    }
}
