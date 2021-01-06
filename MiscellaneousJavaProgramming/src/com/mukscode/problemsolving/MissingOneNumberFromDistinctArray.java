package com.mukscode.problemsolving;

public class MissingOneNumberFromDistinctArray {

	public static void main(String[] args) {
		//n = 1 to 9
		int n = 20;
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19,20};
		System.out.println(MissingNumber(n, intArray));
	}
	
	public static int MissingNumber(int num, int[] ar) {
		
		int sum = 0;
		for(int i : ar) {
			sum += i;
		} 
		
		return((num*(num+1)/2) - sum );
	}

}

