package com.skplanet.plalab.h2hyun37;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FtoC {

	/*
	 * [11/24] Math.Round() 메소드를 사용하지 않고 소수점 셋째 자리에서 반올림하기
	 * 
	 * 화씨온도를 섭씨온도로 변환하는 코드를 작성하고 소수점 셋째 자리에서 반올림하자!
	 * 
	 * 단, Math.round, String.format, System.out.printf 등의 메소드는 사용하지 않는다.
	 * 
	 * 오직 형변환을 이용하여 반올림하자.
	 */
	public static void main(String[] args) {

		/*
		 * Step 1 : 섭씨 -> 화씨
		 * 
		 * Formula : °C x 9/5 + 32 = °F
		 */

		System.out.print("섭씨입력 (숫자만) : ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float cel1 = 0;
		try {
			cel1 = Float.parseFloat(in.readLine());
		} catch (Exception e) {
			System.out.println("INPUT ERROR : ");
			e.printStackTrace();
		}

		// float cel1 = 100f; // TEST
		float fah1 = (float) (cel1 * 9.0 / 5 + 32);

		System.out.println("섭씨 -> 화씨 변환 : " + cel1 + " °C = " + fah1 + "°F");

		/*
		 * Step 2 : 화씨 -> 섭씨
		 * 
		 * Formula : (°F - 32) x 5/9 = °C
		 */

		float fah2 = 100.0f;

		float cel2 = (float) ((fah2 - 32) * 5.0 / 9);

		System.out.println("화씨 -> 섭씨변환 : " + fah2 + "°F = " + cel2 + "°C");

	}
}
