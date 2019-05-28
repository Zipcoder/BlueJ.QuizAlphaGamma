 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilitiesAddTest
{
    private MathUtilities utilities;
    private static final double DELTA = 0.009;

    @org.junit.Before
    public void setup(){
        utilities = new MathUtilities(); 
    }

    @org.junit.Test
    public void testAddInteger(){
        //Given
        int expected = 15;
        int x = 7;
        int y = 8;
        //When
        int actual = utilities.add(x,y);
       
        //Then
        assertEquals(expected, actual);
       
  
        
    }

    @org.junit.Test
    public void testAddDouble(){
        //Given
        double expected = 11.22;
      
        

        //When
        double actual = utilities.add(10.0, 1.22);

        //Then
        assertEquals(expected, actual, DELTA);
    }
}