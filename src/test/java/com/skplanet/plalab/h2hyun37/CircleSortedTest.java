package com.skplanet.plalab.h2hyun37;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleSortedTest {



	@Test
	public void testtrue() throws Exception {
		CircleSorted calc = new CircleSorted();

		int[] A1 = { 3, 0, 1, 2 };
		assertEquals(true, calc.isCircleSorted(A1));
		
		int[] A2 = {2,3,4,5,0,1};
		assertEquals(true, calc.isCircleSorted(A2));
		
		int[] A3 = {4,5,6,9,1};
		assertEquals(true, calc.isCircleSorted(A3));
		
		int[] A4 = {10,11,6,7,9};
		assertEquals(true, calc.isCircleSorted(A4));
		
		int[] A5 = {1,2,3,4,5};
		assertEquals(true, calc.isCircleSorted(A5));
		
		int[] A6 = {5,7,43,987,-9,0};
		assertEquals(true, calc.isCircleSorted(A6));

		int[] A7 = { 3, 0, 1, 2 };
		assertEquals(true, calc.isCircleSorted(A7));


	}

	@Test
	public void testfalse() throws Exception {
		CircleSorted calc = new CircleSorted();
		int[] A1 = { 9, 10, 14, 12 };
		assertEquals(false, calc.isCircleSorted(A1));

		int[] A2 = { 4, 1, 2, 5 };
		assertEquals(false, calc.isCircleSorted(A2));

		int[] A3 = { 8, 7, 6, 5, 4, 3 };
		assertEquals(false, calc.isCircleSorted(A3));

		int[] A4 = { 6, 7, 4, 8 };
		assertEquals(false, calc.isCircleSorted(A4));

		int[] A5 = { 7, 6, 5, 4, 3, 2, 1 };
		assertEquals(false, calc.isCircleSorted(A5));
		

	}


}
