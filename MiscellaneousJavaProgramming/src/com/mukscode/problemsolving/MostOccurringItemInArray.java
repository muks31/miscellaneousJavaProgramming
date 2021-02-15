package com.mukscode.problemsolving;

import java.util.HashMap;

public class MostOccurringItemInArray {

	public static void main(String[] args) {
		
		int[] array = {2, 3};
		System.out.println(mostOccurringItem(array));
		
	}

	private static Integer mostOccurringItem(int[] arr) {
		Integer maxCount = -1, maxItem = null;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int value = map.get(arr[i]);
				map.put(arr[i], value+1);
			}
			else {
				map.put(arr[i], 1);
			}
			if(map.get(arr[i]) > maxCount) {
				maxCount = map.get(arr[i]);
				maxItem = arr[i];
			}
		}
		return maxItem;
		
		
	}

}
