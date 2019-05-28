 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if(number == 0){
              return 1;
          }
          else if(number < 0){
              return -1;
          }
          else {
              Integer fact = 1;
              for(int i = 1; i <= number; i++){
                  fact = fact * i;
              }
              return fact;
          }
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          StringBuilder sbuild = new StringBuilder();
          sbuild.append(phrase.charAt(0));
          int spaceInd = phrase.indexOf(' ');
          while(spaceInd != -1){
              if(spaceInd != phrase.length() - 1){
                  sbuild.append(phrase.charAt(spaceInd + 1));
                  spaceInd = phrase.indexOf(' ', spaceInd + 1);
              }
          }
          //System.out.println(phrase + "      " + sbuild.toString());
          return sbuild.toString().toUpperCase();
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
          /*
          for(int i = 97; i < 124; i++){
              System.out.println(i + "     "  + (char)i);
            }
            */
          StringBuilder sbuild = new StringBuilder();
          for(int i = 0; i < word.length(); i++){
              int intVal = (int)(word.charAt(i)%97) + 3;
              sbuild.append((char)((intVal%26) + 97));
              //System.out.println(word.charAt(i) + "       " + (intVal + 97) + "      " + (char)((intVal%97) + 97));
              //System.out.println(word.charAt(i) + "      intVal: " + intVal);
          }
          //System.out.println(word +  "        " + sbuild.toString());
          return sbuild.toString();
      }
}
