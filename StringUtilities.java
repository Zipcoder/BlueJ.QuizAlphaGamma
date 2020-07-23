import java.util.Scanner;
import java.io.*;


public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String sum = baseValue.concat(valueToBeAdded);
        return sum;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
       String rev = "";
       for(int x = valueToBeReversed.length()-1; x>=0; x--){
        rev = rev + valueToBeReversed.charAt(x);
        
        }
       return rev;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        
        int x = word.length();
        int y= x/2;
        char really = word.charAt(y);
        
        
        return really;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int x = sentence.lastIndexOf(" ");
        int y = sentence.length();
        
        String word = sentence.substring(x+1,y);
        return word;
    }
}
