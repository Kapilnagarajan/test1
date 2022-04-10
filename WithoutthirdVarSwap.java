package org.prog;

import java.util.Scanner;

public class WithoutthirdVarSwap {

	public static void main(String[] args) {

		int a = 2, b = 3;

		// Scanner k = new Scanner(System.in);
		//
		// System.out.println("The numbers are");
		// a = k.nextInt(); // 2
		// b = k.nextInt(); // 3
		a = a + b; // 2+3 = 5
		b = a - b; // 5-3 = 2
		a = a - b;// 5-2 = 3

		System.out.println("The Value of A - " + a);
		System.out.println("The Value of B - " + b);
	}

}
