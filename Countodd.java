package org.prog;

public class Countodd {

	public static void main(String[] args) {
		int k = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				k = k + 1;
				System.out.println(i);
			}
		}
		System.out.println(k);
	}

}
