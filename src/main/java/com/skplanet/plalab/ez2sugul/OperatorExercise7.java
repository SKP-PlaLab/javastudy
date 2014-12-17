package com.skplanet.plalab.ez2sugul;

public class OperatorExercise7 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius =  (int) ((5.0/9 * (fahrenheit - 32.0f)) * 100 + 0.5f) / 100f;
		
//		celcius = celcius * 100f;
//		celcius = celcius + 0.5f;
//		celcius = (int) celcius;
//		celcius = celcius / 100f;
		
		System.out.println("fahrenheit = " + fahrenheit);
		System.out.println("celcius = " + celcius);
	}

}
