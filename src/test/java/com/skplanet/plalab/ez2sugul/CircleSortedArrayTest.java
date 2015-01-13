package com.skplanet.plalab.ez2sugul;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CircleSortedArrayTest {
	private CircleSortedArray csArray;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		csArray = new CircleSortedArray();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTrue() {
		assertEquals(true, csArray.isCircleSorted(new int[] {2,3,4,5,0,1}));
		assertEquals(true, csArray.isCircleSorted(new int[] {3,0,1,2}));
		assertEquals(true, csArray.isCircleSorted(new int[] {5,7,43,987,-9,0}));
	}
	
	@Test
	public void testFalse() {
		assertEquals(false, csArray.isCircleSorted(new int[] {4,1,2,5}));
		assertEquals(false, csArray.isCircleSorted(new int[] {9,10,14,12}));
		assertEquals(false, csArray.isCircleSorted(new int[] {7,6,5,4,3,2,1,}));
	}

}
