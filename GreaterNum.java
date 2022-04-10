package org.prog;

public class GreaterNum {

	public static void main(String[] args) {

		int a = 67, b = 87, c = 56, d = 1;

		if (a > b && a > c && a > d) {

			System.out.println(a + " - is greater");

		} else if (b > a && b > c && b > d) {
			System.out.println(b + " - is greater");

		} else if (c > a && c > b && c > d) {
			System.out.println(c + " - is greater");

		} else {
			System.out.println(d + " - is greater");
		}

	}

}
