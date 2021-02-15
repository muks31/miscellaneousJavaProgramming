package com.mukscode.problemsolving;

import java.util.HashMap;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "abbcdd";
		System.out.println(nonRepeating(s));
		
	}

	public static Character nonRepeating(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				int value = map.get(s.charAt(i));
				map.put(s.charAt(i), value+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		for(int i = 0; i< s.length(); i++) {
			if(map.get(s.charAt(i)) == 1){
				return s.charAt(i);
			}
		}
		return null;


	}
}
