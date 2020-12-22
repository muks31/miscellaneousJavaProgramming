package com.mukscode.problemsolving;

import java.util.Scanner;

public class Swapping_v2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers to be swapped");
		
		System.out.println("First Number: ");
		int firstNumber = sc.nextInt();
		
		System.out.println("Second Number: ");
		int secondNumber = sc.nextInt();
		
		firstNumber  = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber  = firstNumber - secondNumber;
		System.out.println("After Swapping - First Number is: "+firstNumber+" Second Number is: "+secondNumber);
		
		

	}

}
