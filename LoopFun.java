 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer product = 1;
          for(int i =1; i<= number; i++)
            product *= i;
          return product;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String output = "";
          String [] words = phrase.split(" ");
          for(int i = 0; i<words.length; i++){
              String [] letters = words[i].split("");
              output += letters[0].toUpperCase();
            }
          return output;
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
          /** 
           * Converts char array to ascii integers,
           * add 3 to each letter, 
           * 
           * if it doesnt go over letter z converts to char
           * else does math to reset ascii integer to letter a and converts to char
           *
           *ascii:
           *      int : char
           *      --- : ----
           *       97 : a
           *      122 : z
          */
          char [] array = word.toCharArray();
          for(int i = 0; i<array.length; i++){
              if((int)array[i] + 3 <= 122)
                array[i] = (char)((int)array[i] + 3); 
              else
                array[i] = (char)( ((((int)array[i] + 3) - 122) + 96) ); 
          }
          
          return String.valueOf(array);
      }
}
