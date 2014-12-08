package com.skplanet.plalab.ez2sugul.loop;

public class ReverseTriangle {
	public static void main(String[] args) {
		int maxRow = 5;
		int maxColumn = 5;
		
		for (int i = 0; i < maxRow; i++) {
			for (int j = 0; j < maxColumn; j++) {
				System.out.print("*");
				if (j == maxColumn - 1) {
					System.out.println("");
				}
			}
			maxColumn--;
		}
	
	}
}
