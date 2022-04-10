package org.prog;

public class VowelsCount {

	public static void main(String[] args) {

		String k = "KapilNagarajan";
		int Vcount = 0, Ccount = 0;
		String v = "", c = "";

		for (int i = 0; i < k.length(); i++) {
			char d = k.charAt(i);

			if (d == 'A' || d == 'a' || d == 'E' || d == 'e' || d == 'I' || d == 'i' || d == 'O' || d == 'o' || d == 'U'
					|| d == 'u') {
				Vcount++;
				v = v + d;
			} else {
				Ccount++;
				c = c + d;
			}
		}
		System.out.println("Vowel count :" + Vcount);
		System.out.println("Consonent count :" + Ccount);
		System.out.println("Vowel present :" + v);
		System.out.println("Consonant present :" + c);

	}

}
