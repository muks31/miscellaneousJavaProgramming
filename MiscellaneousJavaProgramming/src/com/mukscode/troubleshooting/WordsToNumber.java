package com.mukscode.troubleshooting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class WordsToNumber {

	public static void main(String[] args) {
		
		wordsToNumberGenerator("ninety nine");
	}
	public static void wordsToNumberGenerator(String givenString) {
		
		boolean isValidgivenString = true;
	    long result = 0;
	    long finalResult = 0;
	    List<String> allowedStrings = Arrays.asList
	    (
	    "zero","one","two","three","four","five","six","seven",
	    "eight","nine","ten","eleven","twelve","thirteen","fourteen",
	    "fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
	    "thirty","forty","fifty","sixty","seventy","eighty","ninety",
	    "hundred","thousand","million","billion","trillion"
	    );

	    if(givenString != null && givenString.length()> 0)
	    {
	        givenString = givenString.replaceAll("-", " ");
	        givenString = givenString.toLowerCase().replaceAll("and", " ");
	        String[] split = givenString.trim().split("\\s+");
	        
	        for(String str : split)
	        {
	            if(!allowedStrings.contains(str))
	            {
	                isValidgivenString = false;
	                System.out.println("cannot convert");
	                break;
	            }
	        }
	        if(isValidgivenString)
	        {
	            for(String str : split)
	            {
	                if(str.equalsIgnoreCase("zero")) {
	                    result += 0;
	                }
	                else if(str.equalsIgnoreCase("one")) {
	                    result += 1;
	                }
	                else if(str.equalsIgnoreCase("two")) {
	                    result += 2;
	                }
	                else if(str.equalsIgnoreCase("three")) {
	                    result += 3;
	                }
	                else if(str.equalsIgnoreCase("four")) {
	                    result += 4;
	                }
	                else if(str.equalsIgnoreCase("five")) {
	                    result += 5;
	                }
	                else if(str.equalsIgnoreCase("six")) {
	                    result += 6;
	                }
	                else if(str.equalsIgnoreCase("seven")) {
	                    result += 7;
	                }
	                else if(str.equalsIgnoreCase("eight")) {
	                    result += 8;
	                }
	                else if(str.equalsIgnoreCase("nine")) {
	                    result += 9;
	                }
	                else if(str.equalsIgnoreCase("ten")) {
	                    result += 10;
	                }
	                else if(str.equalsIgnoreCase("eleven")) {
	                    result += 11;
	                }
	                else if(str.equalsIgnoreCase("twelve")) {
	                    result += 12;
	                }
	                else if(str.equalsIgnoreCase("thirteen")) {
	                    result += 13;
	                }
	                else if(str.equalsIgnoreCase("fourteen")) {
	                    result += 14;
	                }
	                else if(str.equalsIgnoreCase("fifteen")) {
	                    result += 15;
	                }
	                else if(str.equalsIgnoreCase("sixteen")) {
	                    result += 16;
	                }
	                else if(str.equalsIgnoreCase("seventeen")) {
	                    result += 17;
	                }
	                else if(str.equalsIgnoreCase("eighteen")) {
	                    result += 18;
	                }
	                else if(str.equalsIgnoreCase("nineteen")) {
	                    result += 19;
	                }
	                else if(str.equalsIgnoreCase("twenty")) {
	                    result += 20;
	                }
	                else if(str.equalsIgnoreCase("thirty")) {
	                    result += 30;
	                }
	                else if(str.equalsIgnoreCase("forty")) {
	                    result += 40;
	                }
	                else if(str.equalsIgnoreCase("fifty")) {
	                    result += 50;
	                }
	                else if(str.equalsIgnoreCase("sixty")) {
	                    result += 60;
	                }
	                else if(str.equalsIgnoreCase("seventy")) {
	                    result += 70;
	                }
	                else if(str.equalsIgnoreCase("eighty")) {
	                    result += 80;
	                }
	                else if(str.equalsIgnoreCase("ninety")) {
	                    result += 90;
	                }
	                else if(str.equalsIgnoreCase("hundred")) {
	                    result *= 100;
	                }
	                else if(str.equalsIgnoreCase("thousand")) {
	                    result *= 1000;
	                    finalResult += result;
	                    result=0;
	                }
	            }

	            finalResult += result;
	            result=0;
	            System.out.println(finalResult);
	        }
	    }
		
	}
	
	

}