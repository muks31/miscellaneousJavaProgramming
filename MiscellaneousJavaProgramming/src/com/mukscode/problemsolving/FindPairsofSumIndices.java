package com.mukscode.problemsolving;

import java.util.Arrays;
import java.util.HashMap;

public class FindPairsofSumIndices {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 6, 4}, 9)));

	}
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<nums.length; i++){
			map.put(nums[i], i);
		}

		for(int i =0; i<nums.length; i++){
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i){
				return new int[]{i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("No two sum Solution");
	}

}
