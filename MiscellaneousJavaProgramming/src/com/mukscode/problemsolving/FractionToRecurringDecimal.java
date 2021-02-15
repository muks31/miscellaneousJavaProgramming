package com.mukscode.problemsolving;

import java.util.HashMap;

class FractionToRecurringDecimal
{
	public static void main(String[] args){
		System.out.println(fractionToDecimal(93, 7));
	}

	private static String fractionToDecimal(int num, int de_num) {

		StringBuilder ans = new StringBuilder();
		int quotant = num / de_num;
		int remainder = num % de_num;
		ans.append(quotant);

		if(remainder == 0) {
			return ans.toString();
		}
		else {
			ans.append(".");
			HashMap<Integer, Integer> map = new HashMap<>();
			while(remainder != 0) {
				if(map.containsKey(remainder)) {
					int position = map.get(remainder);
					ans.insert(position, "(");
					ans.append(")");
					break;
				}
				else {
					map.put(remainder, ans.length());
					remainder *= 10;
					quotant = remainder / de_num;
					remainder = remainder % de_num;
					ans.append(quotant);
				}
			}
		}
		return ans.toString();

	}
}