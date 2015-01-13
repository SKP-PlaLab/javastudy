package com.skplanet.plalab.ez2sugul;

public class Test {
	public static void main(String[] args) {
		char[] hex = { 'C', 'A', 'F', 'E' };
		// A ~ Z, 'A'
		// 0 ~ 9, '0'

		String[] binary = { "0000", "0001", "0010", "0011",
				// 0, 1, 2, 3
				"0100", "0101", "0110", "0111",
				// 4, 5, 6, 7
				"1000", "1001", "1010", "1011",
				// 8, 9, 10, D
				"1100", "1101", "1110", "1111", };
				// 12,E, F, G, 16

		String result = "";

		for (int i = 0; i < hex.length; i++) {
			// binary[ hex[i] - 'A' + 10 ])
			// Integer.parseInt(binary[ hex[i] - 'A' + 10 ]))
		}
		String octal = Integer.valueOf("1000", 2).toString();
		System.out.println(octal);
		System.out.println(Integer.valueOf("0x" + octal, 8));
		// System.out.println("hex " + new String(hex));
		// System.out.println(result);
	}
}
