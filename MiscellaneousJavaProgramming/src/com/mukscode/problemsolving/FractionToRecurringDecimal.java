package com.mukscode.problemsolving;



class FractionToRecurringDecimal
{
	public static void main(String[] args){
		fractionToDecimal(2, 3);
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
			while(remainder != 0) {
				remainder *= 10;
				quotant = remainder / de_num;
				remainder = remainder % de_num;
				ans.append(quotant);
			}
		}
		return ans.toString();

	}
}