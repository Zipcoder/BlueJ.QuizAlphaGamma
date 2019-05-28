
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
        String answer = "";
        // so we reverse loop through the length of valueToBeReversed grabbing the
        //characters at index i and add them to answer 
        for(int i = valueToBeReversed.length() -1;i >=0;i--){
        answer += valueToBeReversed.charAt(i); 
        }
        return answer;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        Integer mid = word.length()/2;
        
        return word.charAt(mid);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String holder = "";
        holder = holder.valueOf(charToRemove);
        String answer = value.replace(holder,""); 
        
        return answer;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //split the sentence into an array by spaces
        // use the index of last array to assign the value to last word 
        String[] wordArray = sentence.split(" ");
        String lastWord = wordArray[wordArray.length - 1];
        return lastWord;
    }
}
