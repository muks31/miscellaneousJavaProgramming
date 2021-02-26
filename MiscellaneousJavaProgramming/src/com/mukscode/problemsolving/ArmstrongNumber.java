package com.mukscode.problemsolving;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//Armstrong number is the number which is the sum of the cubes of all its unit, tens and hundred digits for three-digit numbers.
		//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		int num = 153;
		System.out.println(isArmstrongNumber(num));

	}

	private static boolean isArmstrongNumber(int num) {
		int finalAddition = 0;
		int temp;
		int a;
		
		temp = num;
		while(num > 0) {
			
			a = num%10; // 3
			num = num /10; // 15
			finalAddition = finalAddition + (a*a*a);
		}
		if(temp == finalAddition) {
			return true;
		}
		return false;
	}

}
