package com.mukscode.problemsolving;

public class FactorialWithoutRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}

	private static int factorial(int num) {
		int factorial = 1;
		for(int i = 1; i<=num; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
