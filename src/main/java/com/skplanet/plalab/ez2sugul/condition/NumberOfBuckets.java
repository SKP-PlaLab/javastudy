package com.skplanet.plalab.ez2sugul.condition;

public class NumberOfBuckets {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBuckets = (int) ((double)numOfApples / (double)sizeOfBucket + 0.9f);
		
		System.out.println("Required Number of Buckets : " + numOfBuckets);
	}
}
