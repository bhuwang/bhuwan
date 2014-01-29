/**
 * 
 */
package com.nepal;

/**
 * @author bhuwan
 * 
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = 5;
		String greeting = "Hello World";
		greeting = greeting.substring(0, 5);
		System.out.println("Greeting: " + greeting);
		StringBuilder greeting1 = new StringBuilder("Hello World");
		greeting1.substring(0, 5);
		greeting1.reverse();
		System.out.println("Greeting Reverse: " + greeting1);
	}

}
