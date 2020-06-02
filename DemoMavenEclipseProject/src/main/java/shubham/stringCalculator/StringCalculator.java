package shubham.stringCalculator;

//@author Shubham Gupta

public class StringCalculator {
	
    /*
     * Constants
     */

    private final String ONE_DIGIT_OR_MORE_REG_EX = "\\d+";

    /*
     * Public methods
     */


	/**
	 * Parse an string and sum all the numeric values removing the non numeric
	 * characters.
	 *
	 * @param numbers to analyze and sum.
	 * @return the sum value with some restrictions described in the project
	 *         documentation.
	 */
    public int add(final String numbers) {
		int result = 0;
		if (!numbers.isEmpty()) {
            if (onlyContainsOneNumber(numbers)) {
                result = Integer.parseInt(numbers);
            }
		}
		return result;
	}
    
    private boolean onlyContainsOneNumber(final String numbers) {
        return numbers.matches(ONE_DIGIT_OR_MORE_REG_EX);
    }

    /*
     * Auxiliary methods
     */
    
}
