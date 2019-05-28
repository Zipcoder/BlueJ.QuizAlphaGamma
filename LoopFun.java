 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer myAns = 1;
          for (Integer i = 1;  i <= number; i++) {
              myAns = myAns * i;
            }
          return myAns;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String myAns ="";
          
       //   for (Integer i = 0; i < phrase.length() - 1; i++) {
       //       if ((phrase.charAt(i)).equals(" ") && (phrase.charAt(i).equals(" "))) {
        //          
       //         }
       //     }
          
          myAns.toUpperCase();
          return myAns;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. 
       * If the character is
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
          String myAns = "";
          Character myTest;
          
          word.toLowerCase();
          
          for (Integer i = 0; i < word.length(); i++) {
              myTest = word.charAt(i);
              if (myTest.equals(" ")); myAns = myAns + " ";
              if (myTest.equals("a")); myAns = myAns + "d";
              if (myTest.equals("b")); myAns = myAns + "e";
              if (myTest.equals("c")); myAns = myAns + "f";
              if (myTest.equals("d")); myAns = myAns + "g";
              if (myTest.equals("e")); myAns = myAns + "h";
              if (myTest.equals("f")); myAns = myAns + "i";
              if (myTest.equals("g")); myAns = myAns + "j";
              if (myTest.equals("h")); myAns = myAns + "k";
              if (myTest.equals("i")); myAns = myAns + "l";
              if (myTest.equals("j")); myAns = myAns + "m";
              if (myTest.equals("k")); myAns = myAns + "n";
              if (myTest.equals("l")); myAns = myAns + "o";
              if (myTest.equals("m")); myAns = myAns + "p";
              if (myTest.equals("n")); myAns = myAns + "q";
              if (myTest.equals("o")); myAns = myAns + "r";
              if (myTest.equals("p")); myAns = myAns + "s";
              if (myTest.equals("q")); myAns = myAns + "t";
              if (myTest.equals("r")); myAns = myAns + "u";
              if (myTest.equals("s")); myAns = myAns + "v";
              if (myTest.equals("t")); myAns = myAns + "w";
              if (myTest.equals("u")); myAns = myAns + "x";
              if (myTest.equals("v")); myAns = myAns + "y";
              if (myTest.equals("w")); myAns = myAns + "z";
              if (myTest.equals("x")); myAns = myAns + "a";
              if (myTest.equals("y")); myAns = myAns + "b";
              if (myTest.equals("z")); myAns = myAns + "c";

          }
          
          return myAns;
      }
}
