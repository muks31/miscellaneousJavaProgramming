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
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Value of String that needs to be revesed: ");
		String userInput = scan.next();
		
		char[] userInputasChar = userInput.toCharArray();
		
		for(int i = (userInputasChar.length-1); i>=0; i--) {
			
			System.out.print(userInputasChar[i]);
		}
		scan.close();

	}

}
