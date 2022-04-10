package org.prog;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a=10, b=20, c;
//		Scanner j = new Scanner(System.in);
//		System.out.println("Enter the number");
//		a = j.nextInt();
//		b = j.nextInt();

		c = a;
		a = b;
		b = c;

		System.out.println("Swapped Numbers are");
		System.out.println("A is - " + a);
		System.out.println("B is  - " + b);

	}

}
