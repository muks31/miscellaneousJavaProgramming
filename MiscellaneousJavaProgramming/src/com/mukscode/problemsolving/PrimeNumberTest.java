package com.mukscode.problemsolving;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		boolean isPrimeNumber = true ;
		
		for(int i=2; i<num/2; i++) {
			
			if(num%i==0) {
				isPrimeNumber = false;
				break;
			}
		}
		if(isPrimeNumber) {
			System.out.println("Entered number is a prime number "+num);
		}
		else {
			System.out.println("Entered Number is not a prime number "+num);
		}
		
		

	}

}
