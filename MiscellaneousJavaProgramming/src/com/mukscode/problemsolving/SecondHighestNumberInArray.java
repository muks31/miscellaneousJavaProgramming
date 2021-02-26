package com.mukscode.problemsolving;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {23, 12, 9, 87, 19};
		System.out.println(secondHighestNumber(arr));

	}

	private static int secondHighestNumber(int[] arr) {
		int highestNum = 0;
		int secondHighestNum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > highestNum) {
				secondHighestNum = highestNum;
				highestNum = arr[i];
			}
			else if(arr[i] > secondHighestNum) {
				secondHighestNum  = arr[i];
			}
		}
		return secondHighestNum;
	}

}
