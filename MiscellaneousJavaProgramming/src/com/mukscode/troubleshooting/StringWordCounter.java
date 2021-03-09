package com.mukscode.troubleshooting;

import java.util.Scanner;

public class StringWordCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		System.out.println("The number of words in given String is: "+stringWords(input));

	}

	private static int stringWords(String input) {
		String[] words = input.split("[^A-Za-z-]+");
		return words.length;
	}

}
