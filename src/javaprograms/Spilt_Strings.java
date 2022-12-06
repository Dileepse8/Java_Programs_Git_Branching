package javaprograms;

import java.util.StringTokenizer;



public class Spilt_Strings {

	public static void main(String[] args) {

		String str = "123-99857965";
		String[] s = str.split("-");
		for (String string : s) {
			System.out.println(string);
		}
		// Approch-2
		System.out.println("Approch-2");
		StringTokenizer stri = new StringTokenizer(str, "-");
		while (stri.hasMoreTokens()) {
			String s2 = stri.nextToken();
			System.out.println(s2);
		}
		// Approch-2
		System.out.println("Approch-3 SplitUtils");
		

	}

}
