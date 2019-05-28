

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if (number == 0){
              number = 1;
            }
          else {number = number*factorial(number-1);
            }
            return number;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] splitPhrase = phrase.split("\\s+");
          String acronym = "";
          for (int i = 0; i < splitPhrase.length; i++){
              splitPhrase[i]=splitPhrase[i].toUpperCase();
              acronym = acronym + splitPhrase[i].charAt(0);
            }
                              
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
          
          for (int i = 0; i <= word.length()-1; i++){
              char letterToChange = word.charAt(i);
              switch(letterToChange){
                  case 'a':
                  encrypted = encrypted + "d";
                  break;
                  case 'b':
                  encrypted = encrypted + "e";
                  break;
                  case 'c':
                  encrypted = encrypted + "f";
                  break;
                  case 'd':
                  encrypted = encrypted + "g";
                  break;
                  case 'e':
                  encrypted = encrypted + "h";
                  break;
                  case 'f':
                  encrypted = encrypted + "i";
                  break;
                  case 'g':
                  encrypted = encrypted + "j";
                  break;
                  case 'h':
                  encrypted = encrypted + "k";
                  break;
                  case 'i':
                  encrypted = encrypted + "l";
                  break;
                  case 'j':
                  encrypted = encrypted + "m";
                  break;
                  case 'k':
                  encrypted = encrypted + "n";
                  break;
                  case 'l':
                  encrypted = encrypted + "o";
                  break;
                  case 'm':
                  encrypted = encrypted + "p";
                  break;
                  case 'n':
                  encrypted = encrypted + "q";
                  break;
                  case 'o':
                  encrypted = encrypted + "r";
                  break;
                  case 'p':
                  encrypted = encrypted + "s";
                  break;
                  case 'q':
                  encrypted = encrypted + "t";
                  break;
                  case 'r':
                  encrypted = encrypted + "u";
                  break;
                  case 's':
                  encrypted = encrypted + "v";
                  break;
                  case 't':
                  encrypted = encrypted + "w";
                  break;
                  case 'u':
                  encrypted = encrypted + "x";
                  break;
                  case 'v':
                  encrypted = encrypted + "y";
                  break;
                  case 'w':
                  encrypted = encrypted + "z";
                  break;
                  case 'x':
                  encrypted = encrypted + "a";
                  break;
                  case 'y':
                  encrypted = encrypted + "b";
                  break;
                  case 'z':
                  encrypted = encrypted + "c";
                  break;
                  case ' ':
                  encrypted = encrypted + " ";
                  break;
                }
              
              
          
            }
          
          return encrypted;
      }
}
