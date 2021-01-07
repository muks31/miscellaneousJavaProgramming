package com.mukscode.problemsolving;

import java.util.HashSet;

public class FindPairsOfSum {

	public static void main(String[] args) {

		int[] intArray = new int[] {1, 2, 3, 5};
		int sum = 8;
		boolean result = hasPairOfSum(intArray, sum);
		System.out.println(result);

	}


	/**
	 * 
	 * Approach - 1 [Using Brute Force Solution]
	 * 
	 * */
	/*public static boolean hasPairOfSum(int[] array, int sum) {

		for(int i = 0; i< array.length-1; i++) {
			for(int j = i+1; j< array.length ; j++) {

				if(array[i] + array[j] == sum) {
					return true;
				}	
			}
		}
		return false;
		}*/

	/**
	 * 
	 * 
	 * Approach - 2 [Efficient One]
	 * 
	 * */

	public static boolean hasPairOfSum(int[] intArray, int sum) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i< intArray.length; i++) {
			if(set.contains(intArray[i])) {
				return true;
			}
			set.add(sum - intArray[i]);
			
		}
		return false;
	}

}
