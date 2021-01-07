package com.mukscode.problemsolving;

import java.util.HashSet;

public class CommonItemsInArrays {

	public static void main(String[] args) {

		char[] ch1 = {'A', 'B', 'C', 'D'};
		char[] ch2 = {'X', 'Y', 'Z'};

		/*
		 * Approach - 1 (Using Brute Force)
		 * 
		 * */
		/*boolean result = false;
		for(int i = 0; i<ch1.length; i++) {

			for(int j = 0; j<ch2.length; j++) {
				if(ch1[i] == ch2[j]) {
					result =  true;
				}
			}
		}
		System.out.println(result);*/

		/*
		 * 
		 * Approach - 2
		 * 
		 * */

		HashSet<Character> set = new HashSet<>();
		boolean result = false;
		for(char c : ch1) {
			set.add(c);
		}

		for(int i =0; i<ch2.length ; i++) {

			if(set.contains(ch2[i]))
				result = true;
		}
		System.out.println(result);
	}

}

