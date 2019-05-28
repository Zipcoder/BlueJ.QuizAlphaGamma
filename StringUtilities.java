
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
        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder sbuild = new StringBuilder();
        for(int i = valueToBeReversed.length() - 1; i > -1; i--){
            sbuild.append(valueToBeReversed.charAt(i));
        }
        return sbuild.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        if(word.length() % 2 == 0){
            return null;
        }
        else {
            return word.charAt((word.length() - 1)/2);
        }
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        // come back and try with regex if time
        StringBuilder sbuild  = new StringBuilder();
        
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) != charToRemove){
                sbuild.append(value.charAt(i));
            }
        }
        return sbuild.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //String revSentence = reverse(sentence);
        int lastInd = reverse(sentence).indexOf(' ');
        if(lastInd == -1){
            return sentence;
        }
        else {
            //lastInd = sentence.length() - lastInd;
            return sentence.substring(sentence.length() - lastInd);
        }
        //return null;
    }
}
