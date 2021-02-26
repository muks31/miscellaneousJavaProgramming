package com.mukscode.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//System.out.println(Arrays.toString(fibonacciGenerator(15)));
		int num = 5;
		fibonacci(num);

	}
	
	//Approach - 1
	/*private static int[] fibonacciGenerator(int num) {
		
		
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
		
	}*/

	//Approach - 2
	private static void fibonacci(int num) {
		
		int a = 0, b = 0, c = 1;
		
		for(int i = 0; i<num; i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.println(a + " ");
		}
	}
}
