/**
 * 
 */
package com.mukscode.problemsolving;
import java.util.*;

/**
 * @author MukeshKumar
 * This class reverse the String without using any String inbuilt functions
 *
 */
public class ReverseString {

		public static void main(String[] args) {
			reverseString("Star Trek");
		}

	private static void reverseString(String string) {
			
			char[] ch = string.toCharArray();
		
		for(int i = (ch.length-1); i>=0; i--) {
			
			System.out.print(ch[i]);
		}

	}

}
