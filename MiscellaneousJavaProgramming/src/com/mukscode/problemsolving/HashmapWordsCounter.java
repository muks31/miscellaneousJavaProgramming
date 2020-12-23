package com.mukscode.problemsolving;

import java.util.*;

public class HashmapWordsCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		
		//This is to check irrespective of case
		String finalStr = str.toLowerCase();
		
		String[] strArray = finalStr.split(" ");
		
		for(int i=0; i<strArray.length; i++) {
			
			if(hmap.containsKey(strArray[i])) {
				int count = hmap.get(strArray[i]);
				hmap.put(strArray[i], count+1);
				
			}
			else {
				hmap.put(strArray[i], 1);
			}
		}
		System.out.println(hmap);
		
		

	}

}
