package com.skplanet.plalab.h2hyun37;


public class CircleSorted {

	/*
	 * Instructions
	 * 
	 * Write a method, isCircleSorted(int[] A), that determines if A is
	 * circularly sorted. An Array is circularly sorted if the elements are
	 * sorted in ascending order, but displaced, or rotated, by any number of
	 * steps.
	 */
	
	
	/* 
	 * For Example:
	 * 
	 * True:
	 * 
	 * isCirleSorted(A={2,3,4,5,0,1});
	 * [4,5,6,9,1]
	 * [10,11,6,7,9]
	 * [1,2,3,4,5]
	 * [5,7,43,987,-9,0]
	 * 
	 * False:
	 * [4,1,2,5]
	 * [8,7,6,5,4,3]
	 * [6,7,4,8]
	 * [7,6,5,4,3,2,1]
	 */


	public boolean isCircleSorted(int[] a) {

		/*
		 * conditions :
		 * 
		 * 1. 오름 차순 정렬이어야 함.단 앞뒤 숫자가 같은 경우 오름차순으로 본다.
		 * 아래 2의 조건처럼 rotation 가능. 
		 * 
		 * 2. rotation 은 1번만 가능. 
		 * 즉 높은 숫자 -> 낮은 숫자로 넘어가는 건 단 한 번. 맨 마지막->맨처음에서 rotation도 포함한다.
		 * ex> [4,5,6,9,1] , [1,2,3,4,5]
		 * 
		 * 3. rotation이 발생했다면, 맨 처음 숫자 > 맨 마지막 숫자 이어야 함 
		 * 3-1) 만약 2.의 조건 (rotation) 이 일어나지 않았다면, 이 조건은 상관이 없다. ex> [1,2,3,4,5]
		 * 
		 * 
		 */

		// check if array is null or empty array
		if (a == null || a.length <= 0) {
			return false;
		}

		StringBuilder sb = new StringBuilder();

		for (int num : a) {
			sb.append(num + ",");
		}
		System.out.println(sb);

		boolean isRotated = false;
		boolean isCircleSorted = true;
		
		int nowNum = 0;
		int beforeNum = 0;

		for (int i = 1; i < a.length; i++) {

			beforeNum = a[i - 1];
			nowNum = a[i];

			
			// check condition 1 : ascending sort ?
			if (beforeNum <= nowNum) {
				continue;

			} else {

				// check condition 2 : if beforeNumber > nowNumber, then... is
				// rotated already ?
				if (isRotated == true) {
					isCircleSorted = false;
					break;
				} else {
					isRotated = true;
				}
			}
		}

		// check condition 3 : if array is already rotated, then lastNumber <
		// firstNumber ?
		if (isRotated == true) {
			int lastNum = a[a.length - 1];
			int firstNum = a[0];

			if (lastNum > firstNum) {
				isCircleSorted = false;
			}
		}


		return isCircleSorted;

	}


}
