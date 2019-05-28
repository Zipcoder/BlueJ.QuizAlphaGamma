 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MathUtilitiesIsOddTest {
    private MathUtilities utilities;

    @Before
    public void setup(){
        utilities = new MathUtilities();
    }

    @Test
    public void testIsOddForOddNumber(int start, int stop){
        String string ="";
        for( int i = start; i < stop; i ++)
        if(i%2 == 1) {
            string += i;
        
        assertTrue(utilities.isOdd(7));
    } }
    

    @Test
    public void testIsOddForEvenNumber(){
        assertFalse(utilities.isOdd(12));
    }

}
