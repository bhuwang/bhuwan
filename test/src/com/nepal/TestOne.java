package com.nepal;

public class TestOne {
	public static void main(String[] args) {
		String name = "Bhuwan";
		Integer a = 7;
		Integer b = 8;
		int res = a.compareTo(b);
		char uniChar = '\u039A';
		System.out.println("a: " + a + " b: " + b + " res: " + res + " uni \u039A:" + uniChar);
		Integer integer = new Integer(56);
		integer.intValue();
		System.out.println("Name: " + name);
		StringBuilder sb = new StringBuilder("Bhuwan Gautam");
		sb.reverse();
		System.out.println("sb: " + sb);
	}
}
