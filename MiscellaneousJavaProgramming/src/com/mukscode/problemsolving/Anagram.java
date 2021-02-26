package com.mukscode.problemsolving;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "Mother In Law";
		String s2 = "Hitler Woman";
		System.out.println(isAnagram(s1, s2));

	}

	private static boolean isAnagram(String s1, String s2) {
		
		String str1 = s1.replaceAll("\\s","") ;
		String str2 = s2.replaceAll("\\s","");
		boolean result = true;
		
		if(str1.length() != str2.length()) {
			result =  false;
		}
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}

}
