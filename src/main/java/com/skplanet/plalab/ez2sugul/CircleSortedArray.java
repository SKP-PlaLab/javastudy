package com.skplanet.plalab.ez2sugul;

public class CircleSortedArray {
	public boolean isCircleSorted(int[] arr) {
		
		int gradient = 0;
//		int gradientVariation = 0;
		int nextIndex;
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				nextIndex = 0;
			} else {
				nextIndex = i + 1;
			}
			
			if (arr[i] > arr[nextIndex]) {
//				if (gradient == 1) {
//					gradientVariation++;
//				}
				if (gradient < 0) {
					return false;
				}
				gradient = -1;
			} else if (arr[i] < arr[nextIndex]) {
//				if (gradient == -1) {
//					gradientVariation++;
//				}
				gradient = 1;
			}
		}
		
		return gradient > 0 ? true : false;
	}
}
