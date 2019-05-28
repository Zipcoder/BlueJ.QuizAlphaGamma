 
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
        String value;
      
        value = baseValue.concat(valueToBeAdded);
        return value;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
      char[] in  = valueToBeReversed.toCharArray();
      int end = in.length-1;
      int begin = 0;
      char temp;
      while(end > begin){
        temp = in[begin];
        in[begin] = in[end];
        in[end] = temp;
        end--;
        begin++;
    }
    return new String(in);
      
        
       //return null;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int len=word.length();
		int c=len/2;
		char ch[]=word.toCharArray();
		//System.out.println("Middle Character is: "+ch[c]);
return ch[c];    
}

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
    //String front = value.substring(0, charToRemove);
    //String back = value.substring(charToRemove+1, value.length());
    //return front + back;
        return value.substring(0, charToRemove) + value.substring(charToRemove + 1);    
}
       

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        

       
        String[] parts = sentence.split(" ");
        String lastWord = parts[parts.length - 1];
        //System.out.println(lastWord); 
        return lastWord;
    }
}
