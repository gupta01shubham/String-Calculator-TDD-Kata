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
    private static final String ONE_NUMBER_ONE_DIGIT_STRING = "1";
    private static final String ONE_NUMBER_STRING = "11";
    private static final String FOUR_NUMBERS_STRING_SUM_ELEVEN = "1,2,3,5";
    private static final String FOUR_NUMBERS_STRING_SUM_SIX_SEPARATOR_NEW_LINE = "1\n2,3";


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
    
    @Test
    public void shouldReturnTheSameValueifTheArgumentContainsOnlyOneNumberWithOneDigit() {
        int result = stringCalculator.add(ONE_NUMBER_ONE_DIGIT_STRING);

        int expectedResult = Integer.parseInt(ONE_NUMBER_ONE_DIGIT_STRING);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnTheSameValueIfTheArgumentContainisOnlyOneNumberWithMoreThanOneDigit() {
        int result = stringCalculator.add(ONE_NUMBER_STRING);

        int expectedResult = Integer.parseInt(ONE_NUMBER_STRING);
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void shoulReturnTheSumOfAnUnknownAmountOfNumbers() {
        int result = stringCalculator.add(FOUR_NUMBERS_STRING_SUM_ELEVEN);

        assertEquals(11, result);
    }
    
    @Test
    public void shouldReturnTheSumofAnUnknownAmountOfNumbersSeparatedWithNewLineCharacters() {
        int result = stringCalculator.add(FOUR_NUMBERS_STRING_SUM_SIX_SEPARATOR_NEW_LINE);

        assertEquals(6, result);
    }
    
}
