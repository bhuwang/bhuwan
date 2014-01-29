/**
 * 
 */
package com.nepal;

/**
 * This call is responsible for String Reverse operation
 * 
 * @author bhuwan
 * 
 */
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringReverse reverse = new StringReverse();
		System.out.println(reverse.getReverseString("Leapfrog Technology"));
	}

	/**
	 * This method will take {@link String} as a parameter and returns the reverse of that string.
	 * 
	 * @param stringToBeReverse
	 * @return reverse of argument in {@link String} type
	 */
	private String getReverseString(String stringToBeReverse) {
		StringBuilder reverseString = new StringBuilder(stringToBeReverse);
		return reverseString.reverse().toString();
	}

}
