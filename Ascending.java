package org.prog;

public class Ascending {

	public static void main(String[] args) {

		int k[] = new int[6];
		k[0] = 45;
		k[1] = 1;
		k[2] = 46;
		k[3] = 35;
		k[4] = 78;
		k[5] = 25;

		int temp = 0;

		for (int i = 0; i < k.length; i++) {

			for (int j = i + 1; j < k.length; j++) {

				if (k[i] < k[j]) { // for descending declare <

					temp = k[i];
					k[i] = k[j];
					k[j] = temp;

				}

			}

		}
		for (int i = 0; i < k.length; i++) {

		 System.out.println(k[i]);

		}
	//	System.out.println(k[0]);
	}

}