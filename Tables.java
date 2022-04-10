package org.prog;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		int j = 30;
		int n = 8; //what table
//		Scanner k = new Scanner(System.in);
//		System.out.println("Enter the Table");
//		n = k.nextInt();
//		System.out.println("Table Upto");
//		j = k.nextInt();
		for (int i = 1; i <= j; i++) {
			int c = n * i;
			System.out.println(n+ "*" + i + "=" + c);

		}

	}

}
