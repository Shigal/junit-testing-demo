import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *
 * @author Lawshiga
 *
 */class SimpleCalculatorTest {

     @Test
    void twoPlusTwoShouldFour(){
         var simpleCalculator = new SimpleCalculator();
         assertEquals(4, simpleCalculator.add(2, 2));
//         assertTrue(simpleCalculator.add(2, 2) == 4);
     }

    @Test
    void threePlusFiveShouldEight(){
        var simpleCalculator = new SimpleCalculator();
        assertEquals(8, simpleCalculator.add(3, 5));
//         assertTrue(simpleCalculator.add(2, 2) == 4);
    }
}