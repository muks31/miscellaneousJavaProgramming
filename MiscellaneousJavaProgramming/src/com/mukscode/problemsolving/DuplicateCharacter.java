package com.mukscode.problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {


		String str = "Muukkeshhh";
		System.out.println(findDuplicateChars(str));

	}

	private static Set<Character> findDuplicateChars(String str) {
		
		Set<Character> duplicateSet = new HashSet<>();
		List<Character> list= new ArrayList<>();
		char[] chArr = str.toCharArray();
		
		/*for(char c : chArr) {
			list.add(c);
		}*/
		
		for(int i = 0; i< str.length(); i++) {
			
			if(!list.contains(chArr[i])) {
				list.add(chArr[i]);
			}
			else {
				duplicateSet.add(chArr[i]);
			}
		}
		return duplicateSet;
		
		
	}

}
