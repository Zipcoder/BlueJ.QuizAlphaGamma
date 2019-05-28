 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
     Integer sum = 0; 
   sum = baseValue + valueToAdd;
      return sum;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      double result = 0;
      result = baseValue+valueToAdd;
      return result;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
     
      double result = 0;
      result = number/2;
      return result;
      
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      boolean result = true;
      result = number%2!=0;
      return result;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      Integer result = 0;
      result =number*number;
      return result;
  }

}
