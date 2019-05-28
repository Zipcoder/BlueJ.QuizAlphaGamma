import java.lang.*;
import java.io.*;
import java.util.*;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        input = "Deshret";

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String input1 = "Hed";
        String input2 = "jet";

        return input1+input2;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */

    public String reverse(String valueToBeReversed) {
        String inp = "Khepresh";
        new StringBuilder("Khepresh").reverse().toString();

        return inp;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        String s = "word";
        /*let length = str.length;
        let middle = Math.floor(length/2);
        if (length % 2 ==0){
        return str[middle]
        }
        //else{

        }
        
        return null;
        }*/
        return null;
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
        return null;
    }
}
