package com.mukscode.problemsolving;

public class TraillingZeroOfAFactorial {

	public static void main(String[] args) {
		
		System.out.println(trailingZeroOfFactorial(560));

	}

	private static int trailingZeroOfFactorial(int num) {
		int count = 0;
		for(int i = 5; num/i > 0; i *=5) {
			count += num/i;
		}
		return count;
	}

}
