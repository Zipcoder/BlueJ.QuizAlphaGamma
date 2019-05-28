
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
        StringBuilder toReverse = new StringBuilder(valueToBeReversed);
        String reversed = toReverse.reverse().toString();
        
        return reversed;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char middleChar;
        int length = word.length();
        
        if (length % 2 == 1){
            middleChar = word.charAt((length/2));
        } else {
            middleChar = word.charAt((length/2) - 1);
        }
        
        
        return middleChar;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String remove = charToRemove.toString();
        String newString = value.replace(remove, "");
        
        return newString;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String sentenceArray[] = sentence.split(" ");
        String lastWord = sentenceArray[sentenceArray.length - 1];
        return lastWord;
    }
}
