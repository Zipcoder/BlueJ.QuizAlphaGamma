import java.lang.System;
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
        String concatenate= baseValue + valueToBeAdded;
        return concatenate;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        
        String reverse= new StringBuffer(valueToBeReversed).reverse().toString();
        
        
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        
        int stringLength = word.length(); 
        int middle = stringLength/2; 
        char c= word.charAt(middle);
        
        return c;
    }
   

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        
        String newString= "";
            for (int i =0; i < value.length(); i++){
                if (value.charAt(i) !=charToRemove) 
                newString += value.charAt(i);
            }      
        
        return newString;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String lastWord = sentence.substring(sentence.lastIndexOf(" ") +1);
        return lastWord;
    }
}
