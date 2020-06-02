package shubham.stringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple StringCalculator.
 */
public class StringCalculatorTest 
{

    /*
     * Constants
     */

    private static final String EMPTY_SET_OF_NUMBERS = "";

    /*
     * Test data
     */

    private StringCalculator stringCalculator;

    /*
     * Before and after methods
     */

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    /*
     * Test methods
     */

    @Test
    public void shouldReturnZeroIfTheArgumentIsEmpty() {
        int result = stringCalculator.add(EMPTY_SET_OF_NUMBERS);
        assertEquals(0, result);
    }
}
