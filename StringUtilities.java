import java.lang.*;
import java.io.*;
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        String name;
        name = input;
        
        return name;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String words;
        words = baseValue + valueToBeAdded;
        return words;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        int len = valueToBeReversed.length();
        StringBuilder dest = new StringBuilder(len);
        int i;
        for (i = (len - 1); i >= 0; i--)
        {
            dest.append(valueToBeReversed.charAt(i));
        }
        return dest.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int len = word.length();
        int i = len/2;
        char ch[] = word.toCharArray();
        return ch[i];
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
        String lastWord = sentence.substring(sentence.lastIndexOf("") + 1);
        
        return lastWord;
    }
}
