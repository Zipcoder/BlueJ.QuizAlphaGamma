
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
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reversedValue = "";
        String[] valueToBeReversedArr = valueToBeReversed.split("");
        for(int i = 0; i < valueToBeReversedArr.length; i++) {
            String letter = valueToBeReversedArr[valueToBeReversedArr.length-(i+1)];
            String newLetter = valueToBeReversedArr[i];
            newLetter = letter;
            reversedValue += newLetter;
            
        }
        
        return reversedValue;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        String [] wordArr = word.split("");
        int middle = wordArr.length/2; 
        return word.charAt(middle) ;
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
