package com.mukscode.problemsolving;

import java.util.HashSet;

public class OneAwayStrings {

	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "abcd";
		System.out.println(isOneAway("abde", "abcde"));

	}
	private static boolean isOneAway(String s1, String s2) {
		if(s1.length() - s2.length() >= 2 || s2.length() - s1.length() >= 2)
			return false;
		
		else if(s1.length() == s2.length())
			return isOneAwaySameLength(s1, s2);
		
		else if(s1.length() > s2.length())
			return isOneAwayDiffLength(s1, s2);
		else 
			return isOneAwayDiffLength(s2, s1);

	}

	private static boolean isOneAwaySameLength(String s1, String s2) {
		int count = 0;
		for(int i = 0; i< s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				count += 1;
				if(count > 1) {
					return false;
				}
			}
		}
		return true;

	}
	
	private static boolean isOneAwayDiffLength(String s1, String s2) {
		int count = 0;
		for(int i = 0; i< s2.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				count += 1;
				i+= i;
			}
			if(count > 1) {
				return false;
			}
		}
		return true;
	}
	

}
