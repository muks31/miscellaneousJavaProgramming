package com.mukscode.problemsolving;

public class PallindromeNumberOrString {

	public static void main(String[] args) {
		
		//We can use reverse approach to find out whether number or string is pallindrome or not
		String str = "999";
		System.out.println(isPallindrome(str));

	}

	private static boolean isPallindrome(String str) {
		
		String s1 = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.reverse();
		String s2 =sb.toString();
		if(s1.equals(s2)) {
			return true;
		}
		return false;
		
	}

}
