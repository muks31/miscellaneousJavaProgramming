package com.mukscode.problemsolving;

public class MiddleThreeChars {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		if(str.length() < 3) {
			return str;
		}
		else {
			int midx = str.length()/2;
			int lastx = midx + 2;
			return str.substring(midx - 1, lastx);
		}
	}
	
	public static void main(String args[]){
		middleThree("aabce");
	}
}
