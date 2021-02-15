package com.mukscode.problemsolving;

import java.util.Arrays;

public class SmallestNumbersThatCantBeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] ar = {1, 1, 1};
		System.out.println(smallestpositive(ar, 3));

	}

	static long smallestpositive(long[] array, int n){
		long output = 1;
		Arrays.sort(array);
		for(int i = 0; i < n && array[i] <= output; i++) {
			output = output + array[i];
		}
		return output; 
    }
}
