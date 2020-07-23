
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        String info = input;
        return info;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String ex = baseValue + valueToBeAdded;
        return ex;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String name = valueToBeReversed;
        int value = name.length();
        String outcome = "";
        
        for(int i = value-1; i >= 0; i--){
          outcome = outcome + name.charAt(i);  
        }
        return outcome;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int position;
        int length;
       
        if(word.length() % 2 == 0){
            position = word.length() / 2-1;
            length = 2;
        } else { 
            position = word.length() / 2;
            length = 1;
        }        
        String result = word.substring(position, position + length);
        
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
        String lastWord = sentence.substring(sentence.lastIndexOf("")+1);
        return lastWord;
    }
}
