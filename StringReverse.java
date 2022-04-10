package org.prog;

public class StringReverse {

	public static void main(String[] args) {

		String k = "The world is ot only for you";
		String rev = " ";

		for (int i = k.length() - 1; i >= 0; i--) {
		//	System.out.println(k.length());
			char c = k.charAt(i);
			rev = rev + c;
		}

		if (k.equals(rev)) {
			System.out.println(k + " is Palindrome ");
		} else {
			System.out.println(k + " is not a palindrome");
		}
		System.out.println(rev);

	}

}
