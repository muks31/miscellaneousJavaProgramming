package com.mukscode.problemsolving;

class EquilibriumPoint {
	
	public static void main(String[] args) {
		int n = 30;
		long[] arr = {20, 17, 42, 25, 32, 32, 30, 32, 37, 9, 2, 33, 31, 17, 14, 40, 9, 12, 36, 21, 8, 33, 6, 6, 10, 37, 12, 26, 21, 3};
		System.out.println(equilibriumPoint(arr, n));
	}
    // Function to find equilibrium point
    // a: input array
    // n: size of array
    public static int equilibriumPoint(long arr[], int n) {
    	int totalSum = 0;
        for(int i = 0; i<n; i++){
        	totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i = 0; i< n ; i++) {
        	if(i != 0)leftSum += arr[i-1];
        	if(totalSum - leftSum - arr[i] == leftSum) {
        		return i+1;
        	}
        }
        return -1;
    }
}
