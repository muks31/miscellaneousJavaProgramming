package com.mukscode.problemsolving;

import java.util.*;

class StringReversev2{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to be reversed: ");
		String str = sc.next();
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		System.out.println(sb.reverse());
		
	}
}