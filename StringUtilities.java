
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
        String res="";
        char [] arrStr=valueToBeReversed.toCharArray();
        for(int i=arrStr.length-1;i>=0;i--)
        res=res+arrStr[i];
        return res;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int j=Math.round(word.length()/2);
        char x=word.charAt(j);
        return x;
    }
    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String res="";
        for(int i=0;i<value.length();i++){
        if(value.charAt(i)!=charToRemove)
        res=res+value.charAt(i);
    }
    return res;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String arr[]=sentence.split(" ");
        String res=arr[arr.length-1];
        return res;
    }
}
