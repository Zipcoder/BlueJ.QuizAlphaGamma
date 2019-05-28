 
import java.util.Scanner;
public class MathUtilities{
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      baseValue= 7; 
      valueToAdd= 8;
      
      int sum= baseValue + valueToAdd;
      
      return sum;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      baseValue= 10.0; 
      valueToAdd= 1.22;
      
      double sum= baseValue + valueToAdd;
      
      return sum;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      Scanner in= new Scanner(System.in);
      number = in.nextInt(); 
      double half= number /2; 
      return half;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      Scanner in= new Scanner(System.in);
      number = in.nextInt();
      
      if (number %2==0){ 
          return false;
        }else 
        return true; 
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      Scanner in= new Scanner(System.in);
      number =in.nextInt();
      int square= number*number;
      return square;
  }

}
