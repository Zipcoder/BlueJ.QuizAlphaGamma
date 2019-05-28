 

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
          for(Integer i = 1; i <= number; i++)
            result *= i;
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
          String[] phraseParsed = phrase.split(" ");
          String acronym = "";
          for(String word: phraseParsed)
            acronym += Character.toUpperCase(word.charAt(0));
          return acronym;
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
          String encrypted = "";
          char shifted;
          Integer shift = 3;
          for(Integer i = 0; i < word.length(); i++) {
              if (Character.isUpperCase(word.charAt(i)))
              {
                  shifted = (char)(word.charAt(i)+shift);
                  if (shifted > 'Z')
                    shifted -= (char) 26;
              }
              else if(Character.isLowerCase(word.charAt(i)))
              {
                  shifted = (char)(word.charAt(i)+shift);
                  if (shifted > 'z')
                    shifted -= (char) 26;
              }
              else  // it's not a letter, can't shift   
                  shifted = word.charAt(i);
              encrypted += shifted;
          }
          return encrypted;
      }
}
