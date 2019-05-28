
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
        String myStr = "";
        
        for (Integer i = 0; i < valueToBeReversed.length(); i++) {
            myStr = valueToBeReversed.charAt(i) + myStr;
        }
        
        return myStr;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        Character myAns;
        Integer iPlace;
        
        if (word.length() % 2 == 0) {
            iPlace = (word.length() / 2) - 1;
            myAns = word.charAt(iPlace);
        }
        else {
            iPlace = (word.length() / 2);
            myAns = word.charAt(iPlace);
        }
        
        return myAns;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String newStr = "";
        
        for (Integer i = 0; i < value.length(); i++) {
          if (value.charAt(i) == charToRemove) {
            }
          else {
              newStr = newStr + value.charAt(i);
            }
        }
        
        return newStr;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String myStr = "";
        Integer mySpace = 0;
        
        
        // Not Finished
        
        for (Integer i = 0; i < sentence.length() - 2; i++) {
     //       if (sentence.charAt(i) == " ") {
     //           mySpace = i;
     //       }
        }
            
        myStr.trim();
        return myStr;
    }
}
