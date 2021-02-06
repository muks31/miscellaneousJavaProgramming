package com.mukscode.problemsolving;

import java.util.Scanner;

public class Swapping_v2 {

	public static void main(String[] args) {
		
		swapping(2, 3);
		
	}

	private static void swapping(int firstNumber, int secondNumber) {
		firstNumber  = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber  = firstNumber - secondNumber;
		System.out.println(firstNumber+" "+ secondNumber);
		
		
		
	}
	
}
