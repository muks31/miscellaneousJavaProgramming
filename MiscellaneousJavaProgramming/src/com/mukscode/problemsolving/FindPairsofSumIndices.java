package com.mukscode.problemsolving;

import java.util.Arrays;
import java.util.HashMap;

public class FindPairsofSumIndices {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] {2, 7, 6, 4}, 9)));

	}
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
       		for(int i = 0; i<nums.length; i++){
            		int delta = target - nums[i];
            
           		 if(map.containsKey(delta)){
               			 return new int[]{i,map.get(delta)};
           		 }
           		 else{
                		map.put(nums[i],i);
            		}
      		  }
        	throw new IllegalArgumentException("No Match Found");

	}

}
