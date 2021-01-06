package com.mukscode.problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingNumbersFromADistinctArray {

	public static void main(String[] args) {
		//n = 1 to 9
		int n = 20;
		int[] intArray = {1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 14, 15, 18, 20};
		System.out.println(missingNumberFinder(n, intArray));
	}
		
		/*
		 * Approach No. 1 - Here will use HashSet to find more than one missing Numbers
		 */
		
	private static List<Integer> missingNumberFinder(int num, int[] ar) {

		HashSet<Integer> set = new HashSet<>();	
		List<Integer> missingNumber = new ArrayList<>();
		for(int i : ar) {
			set.add(i);
		}
		for(int i = 1; i<=num; i++) {
			if(!set.contains(i)) {
				missingNumber.add(i);
			}
		}
		return missingNumber;
	}
}
