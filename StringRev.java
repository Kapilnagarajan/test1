package org.prog;

public class StringRev {

	public static void main(String[] args) {

		String k = "MalayalamM";
		String b = "Tamil";
		String add = k.concat(b);
		System.out.println(add);

		String Rev = new StringBuffer(k).reverse().toString();

		System.out.println(Rev);

		if (Rev.equals(k)) {
			System.out.println(Rev + "- is palindrome");
		} else {
			System.out.println(Rev + "- is not a palindrome");
		}

	}

}
