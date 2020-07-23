

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer result = 1;
          for(int i = 1; i <= number; i++){
              result *= i;
            }
          
          
          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
           String[] wordArr = phrase.split (" ");
           String acronym = "";
        for (int i = 0; i < wordArr.length ; i++) {
            //acronym += String.charAt(wordArr[i]);
            char firstLetter = wordArr[i].charAt(0);
            acronym += String.valueOf(firstLetter);
        }
          return acronym.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String result = "";
          char[] wordArr = word.toCharArray();
          
          for (int i = 0; i < wordArr.length ; i++){ 
              char c = wordArr[i];
              if (c != 'x' || c != 'y' || c != 'z'){
              c += 3;//do encoding here
              result += c;} else 
                if (c == 'x'){
                    result += "a";
                } else if (c == 'y'){
                    result += "b";
                } else if (c == 'z') {
                    result += "c";
                }   
            }
        
          return result;
        }
      
}
