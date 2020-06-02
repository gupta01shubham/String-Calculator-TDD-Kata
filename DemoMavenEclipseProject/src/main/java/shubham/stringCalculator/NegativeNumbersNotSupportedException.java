package shubham.stringCalculator;

import java.util.List;

public class NegativeNumbersNotSupportedException extends Exception {

	/*
	 * Constants
	 */

	private static final String EXCEPTION_NAME = "NegativeNumbersNotSupportedException";

	/*
	 * Attributes
	 */

	private List<Integer> negativeNumbers;

	/*
	 * Constructor
	 */

	public NegativeNumbersNotSupportedException(List<Integer> negativeNumbers) {
		this.negativeNumbers = negativeNumbers;
	}

	/*
	 * Public methods
	 */

	public static String getExceptionName() {
		return EXCEPTION_NAME;
	}

	/*
	 * Override methods
	 */

	@Override
	public String getMessage() {
		return EXCEPTION_NAME + negativeNumbers.toString();
	}

}
