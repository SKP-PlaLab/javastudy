package com.skplanet.plalab.ez2sugul;

import java.util.ArrayList;

public class ClosestNumberFromZero {
	public static void main(String[] args) {
		int[] numArr = { 11, -5, 6, -9, 10, 3, -3, 1, -1 };
		int closestIndex = 0;

		for (int i = 0; i < numArr.length; i++) {
			int absoulteValue = numArr[i] < 0 ? numArr[i] * -1 : numArr[i];
			int closestValue = numArr[closestIndex] < 0 ? numArr[closestIndex] * -1 : numArr[closestIndex];

			if (closestValue > absoulteValue - 0) {
				closestIndex = i;
			} else if (closestValue == absoulteValue && numArr[i] > 0) {
				closestIndex = i;
			}

		}

		System.out.println(numArr[closestIndex]);

		boolean powerOn = false;
		int i = 0;
		while (i <= 5) {
			System.out.println(i);
			i += 2;
			
		}
	}
}
