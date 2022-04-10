package org.prog;

public class Occurance {

	public static void main(String[] args) {

		String k = "KapilNagarajan@1994";
		int u = 0, l = 0, n = 0, sc = 0;
		String u1 = "", l1 = "", n1 = "", sc1 = "";

		for (int i = 0; i < k.length(); i++) {
			char d = k.charAt(i);
			if (Character.isUpperCase(d)) {
				u++;
				u1 = u1 + d;

			} else if (Character.isLowerCase(d)) {
				l++;
				l1 = l1 + d;
			} else if (Character.isDigit(d)) {
				n++;
				n1 = n1 + d;
			} else {
				sc++ ;
				sc1 = sc1 + d;
			}

		}

		System.out.println("UpperCase count is - " + u);
		System.out.println("Lowercase count is - " + l);
		System.out.println("Digit count is - " + n);
		System.out.println("Special char is - " + sc);
		System.out.println("UpperCase are - " + u1);
		System.out.println("Lowercase are - " + l1);
		System.out.println("Digit are - " + n1);
		System.out.println("SpecialChar are - " + sc1);

	}
}