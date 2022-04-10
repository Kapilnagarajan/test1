package org.prog;

public class SumOdd {

	public static void main(String[] args) {

		int k = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				k = k + i;
			}
		}
		System.out.println(k);
	}

}
