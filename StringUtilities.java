
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
        String concaten = baseValue+valueToBeAdded;
        return concaten;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
       StringBuilder inputString = new StringBuilder(valueToBeReversed);
        StringBuilder reverse = inputString.reverse();
        return reverse.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int getChar = word.length()/2;
        System.out.println(word.substring(getChar,getChar+1));
        String middleChar = word.substring(getChar,getChar+1);
        return middleChar.charAt(0);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String newString = value.replaceAll(charToRemove.toString(), "");
        return newString;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] lastWord = sentence.split(" ");
        int size = lastWord.length;
        return lastWord[size-1];
    }
}
