// This is to unmark for test 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer factorialNum = 1;
          for(int i = 1; i <= number; i++) {
              factorialNum *= i;
          }
          return factorialNum;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String result = "";
          boolean endOfWord = true;
          Integer index = 0;
          
          do {
              if((phrase.charAt(index) != ' ') && (endOfWord == true)){
                  // Add to result
                  result += phrase.charAt(index);
                  endOfWord = false;
              }
              
              if(phrase.charAt(index) == ' ') endOfWord = true;
              
              index++;
          } while (index < phrase.length());
          
          result = result.toUpperCase();
          
          return result;
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
          //get numeric value
          //+ 3 to numeric value
          //return new char at current value to Chars
          
          String result = "";
          
          for(int i = 0; i < word.length(); i++) {
              
              switch (word.charAt(i)) {
                 case 'a':
                    result += 'd';
                    break;
                    
                 case 'b':
                    result += 'e';
                    break;
                    
                 case 'c':
                    result += 'f';
                    break;
                    
                 case 'd':
                    result += 'g';
                    break;
                    
                 case 'e':
                    result += 'h';
                    break;
                    
                 case 'f':
                    result += 'i';
                    break;
                    
                 case 'g':
                    result += 'j';
                    break;
                    
                 case 'h':
                    result += 'k';
                    break;
                    
                 case 'i':
                    result += 'l';
                    break;
                    
                 case 'j':
                    result += 'm';
                    break;
                    
                 case 'k':
                    result += 'n';
                    break;
                    
                 case 'l':
                    result += 'o';
                    break;
                    
                 case 'm':
                    result += 'p';
                    break;
                    
                 case 'n':
                    result += 'q';
                    break;
                    
                 case 'o':
                    result += 'r';
                    break;
                    
                 case 'p':
                    result += 's';
                    break;
                    
                 case 'q':
                    result += 't';
                    break;
                    
                 case 'r':
                    result += 'u';
                    break;
                    
                 case 's':
                    result += 'v';
                    break;
                    
                 case 't':
                    result += 'w';
                    break;
                    
                 case 'u':
                    result += 'x';
                    break;
                    
                 case 'v':
                    result += 'y';
                    break;
                    
                 case 'w':
                    result += 'z';
                    break;
                    
                 case 'x':
                    result += 'a';
                    break;
                    
                 case 'y':
                    result += 'b';
                    break;
                    
                 case 'z':
                    result += 'c';
                    break;
                    
                    default:
                        break;
                        
              }
                    
          }
          
          return result;
      }
}
