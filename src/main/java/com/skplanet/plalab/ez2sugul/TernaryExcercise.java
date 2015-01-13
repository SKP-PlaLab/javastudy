package com.skplanet.plalab.ez2sugul;

public class TernaryExcercise {
	public static double f2c(double fahrenheit) {
		double f = 0.0;
		
//		int fahrenheit = 100;
		float celcius =  (int) ((5.0/9 * (fahrenheit - 32.0f)) * 100 + 0.5f) / 100f;
		
		return celcius;
	}
	
	public static void main(String[] args) {
		int num = 10;
		// !함수, 메소드
		// function => 함수, 기능 , method
		// y = f(x) -> x^2 + c  
		// int n = printf("hello, world!");
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		
		//  
		f2c(45.6);
	}
}
