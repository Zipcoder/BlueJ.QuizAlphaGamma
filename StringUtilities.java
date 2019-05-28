

public class StringUtilities 
{
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) 
    {
        String answer = input; //unnecesary to make new variable but feels too simple
        return answer; 
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) 
    {
        String answer = baseValue + valueToBeAdded;
        return answer;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) 
    {
        String answer = "";
        
        for (int i = valueToBeReversed.length() - 1; i >= 0; i--)
        {
            answer = answer +valueToBeReversed.charAt(i);
        }
        return answer;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) 
    {
        Character answer;
        int position;
        int length;
        if (word.length() % 2 == 0)
        {
            position = word.length() / 2 -1;
            length = 2;
        }
        else
        {
            position = word.length() / 2;
            length = 1;
        }
        
        answer = (word.substring(position, position + length)).charAt(0);
        return answer;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) 
    {
        String answerConvert = String.valueOf(charToRemove); //convert Character to String
        String answer = value.replace(answerConvert, "");
        
        return answer;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) 
    {
        String answer = sentence.substring(sentence.lastIndexOf(" ") + 1);
        return answer;
    }
}
