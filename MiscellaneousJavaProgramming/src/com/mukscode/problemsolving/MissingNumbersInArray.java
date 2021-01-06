package com.mukscode.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbersInArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Numbers of elememnts in the array");
		int num = scan.nextInt();
		int[] intArray = new int[num];

		System.out.println("Enter the array elements");
		for(int i=0; i<num; i++) {
			intArray[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(intArray));

		List<Integer> missingNumbers = new ArrayList<>();
		
		Set<Integer> numbers = new HashSet<>();
		
		for(int i : intArray) {
			numbers.add(i);
		}
		
		for(int i = 1; i < intArray.length; i++) {
			if(!numbers.contains(i)) {
				missingNumbers.add(i);
			}
		}
		System.out.println("The Missing Numbers are: "+missingNumbers);

	}
}
