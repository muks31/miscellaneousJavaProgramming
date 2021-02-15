package com.mukscode.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class NthNaturalNumber {

	public static void main(String[] args) {
		System.out.println(findNth(21));

	}
	static long findNth(long N)
    {
		return Long.parseLong(Long.toString(N, 9));
    }

}
