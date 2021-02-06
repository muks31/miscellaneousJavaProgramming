package com.mukscode.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberFinder {

	public static void main(String[] args) {
		System.out.println(evenNumbers(new int[] {2, 4, 5, 7, 8, 10}));

	}

	private static List<Integer>  evenNumbers(int[] numbers) {
		List<Integer> evenNumbers = new ArrayList<>();
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2==0) {
				evenNumbers.add(numbers[i]);
			}
		}
		return evenNumbers;
		
	}

}
