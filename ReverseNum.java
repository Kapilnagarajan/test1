package org.prog;

public class ReverseNum {

	public static void main(String[] args) {
		int a = 989;
		int rev = 0;
		int ki = a;

		while (a > 0) {

			int rem = a % 10;
			rev = (rev * 10) + rem;
			a = a / 10;

		}
		System.out.println(rev);

		if (ki == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
