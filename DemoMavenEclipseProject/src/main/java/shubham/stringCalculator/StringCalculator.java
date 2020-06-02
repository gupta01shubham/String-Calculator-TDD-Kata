package shubham.stringCalculator;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@author Shubham Gupta

public class StringCalculator {

	/*
	 * Constants
	 */

	private static final String ONE_DIGIT_OR_MORE_REG_EX = "-?\\d+";
	private static final Pattern numberPattern = Pattern.compile(ONE_DIGIT_OR_MORE_REG_EX);
    private static final Integer EXCLUDED_NUMBER = 1000;

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
	public int add(final String numbers) throws NegativeNumbersNotSupportedException {
		List<Integer> numberList = extractNumberList(numbers);
        numberList = removeIgnoredValues(numberList);
		checkIfThereAreNegativeNumbers(numberList);
		return sumNumbers(numberList);
	}

	/*
	 * Auxiliary methods
	 */

    private List<Integer> removeIgnoredValues(List<Integer> numberList) {
        List<Integer> validNumbers = new LinkedList<Integer>();
        for (Integer number : numberList) {
            if (number < EXCLUDED_NUMBER) {
                validNumbers.add(number);
            }
        }
        return validNumbers;
    }
    
	private void checkIfThereAreNegativeNumbers(List<Integer> numberList) throws NegativeNumbersNotSupportedException {
		List<Integer> negativeNumbers = new LinkedList<Integer>();
		for (Integer num : numberList) {
			if (num < 0) {
				negativeNumbers.add(num);
			}
		}
		if (negativeNumbers.size() > 0) {
			throw new NegativeNumbersNotSupportedException(negativeNumbers);
		}
	}

	private List<Integer> extractNumberList(String numbers) {
		List<Integer> result = new LinkedList<Integer>();
		if (!numbers.isEmpty()) {
			result = getNumbersUsingRegEx(numbers);
		}
		return result;
	}

	private List<Integer> getNumbersUsingRegEx(String string) {
		Matcher matcher = numberPattern.matcher(string);
		return extractNumbersFromMatcher(matcher);
	}

	private LinkedList<Integer> extractNumbersFromMatcher(Matcher matcher) {

		LinkedList<Integer> numbers = new LinkedList<Integer>();

		while (matcher.find()) {
			int number = Integer.parseInt(matcher.group());
			numbers.add(number);
		}
		return numbers;
	}

	private int sumNumbers(List<Integer> numberList) {
		int sum = 0;
		for (Integer num : numberList) {
			sum += num;
		}
		return sum;
	}

}
