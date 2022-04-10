package org.prog;

public class CountNum {

	public static void main(String[] args) {

		int k = 7094725;
		int count = 0;

		while (k > 0) {

			count++;
			k =k/10;
		}
		System.out.println(count);
	}

}
