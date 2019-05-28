  

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number)
      {
         int answer = 1;
         for (int i = 1;  i <= number; i++)
         {
             answer = answer * i;
         }
          return answer;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) 
      {
          String answer = "";
        
        /* create a loop where I add the first letter to the String answer
        * then add every letter after a space to the String answer
        */
        
          /*for (int i = 0; i < phrase.length(); i++)
          {
              answer.append(phrase.charAt(0)); //issue with append
              if(phrase.charAt(i) == ' ')
              {
                  ++i;
                  answer.append((phrase).charAt(i));
                }
           }*/
          return answer;
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
      public String encrypt(String word) 
      {
          String answer = "";
          int shift = 3;
          int length = word.length();
          for(int i = 0; i < length; i++)
          {
              char c = (char)(word.charAt(i) + shift);
              if (c > 'z')
                {
                    answer += (char)(word.charAt(i) - (26-shift));
                }
              else
                {
                    answer += (char)(word.charAt(i) + shift);
                }
          }  
          return answer;
      }
}
