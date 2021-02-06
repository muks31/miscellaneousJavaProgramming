package com.mukscode.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fibonacciGenerator(15)));

	}

	private static int[] fibonacciGenerator(int num) {
		
		int[] intArray = new int[num];
		int counter = 0;
		while(counter < num) {
			if(counter == 0) {
				intArray[counter] = 0;
			}
			else if(counter == 1) {
				intArray[counter] = 1;
			}
			else {
				int next = intArray[counter - 1] + intArray[counter-2];
				intArray[counter] = next;
			}
			counter++;
		}
		return intArray;
		
	}

}
