package com.skplanet.plalab.ez2sugul;

public class SqareEveryDigits {
	
	public static int SquareEveryDigits(int n) {
		String[] splitedInteger = String.valueOf(n).split(""); 
		
		for (int i = 0; i < splitedInteger.length; i++) {
			int num = Integer.parseInt(splitedInteger[i]);
			num = num * num;
			splitedInteger[i] = String.valueOf(num);
		}
		
		String result = "";
		for (String string : splitedInteger) {
			result += string;
		}
		
		return Integer.parseInt(result);
	}
	
	public static void main(String[] args) {
		System.out.println(SquareEveryDigits(9114));
	}
}
