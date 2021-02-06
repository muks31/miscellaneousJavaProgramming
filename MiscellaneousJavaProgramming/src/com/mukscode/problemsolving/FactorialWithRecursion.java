package com.mukscode.problemsolving;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(15));

	}

	private static int factorial(int num) {
		if(num==1)
			return 1;
		else 
			return num * factorial(num-1);	
		
	}

}
