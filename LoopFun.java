import java.util.Arrays;
import java.util.*;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int fax = 1;
          for (int i = 2; i <= number; i++){
              fax *= i;
          }
          
          return fax;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          
          String acronym = "";
          String[] phraseArray = phrase.split(" ");
          for (String element : phraseArray){
              acronym += element.charAt(0);
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
          String[] letterArray = word.split("");
          String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c"};
          ArrayList<String> alteredArray = new ArrayList<String>();
          
          for (int i = 0; i < letterArray.length; i++){
              int indx = Arrays.asList(alphabet).indexOf(letterArray[i]);
              alteredArray.add(alphabet[indx + 3]);
            }
 
          String finalString = "";
          for (String s : alteredArray){
              finalString += s;
            }
         
          return finalString;
      }
}
