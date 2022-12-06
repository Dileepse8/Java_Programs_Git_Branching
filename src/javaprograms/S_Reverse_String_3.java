package javaprograms;

import java.util.Scanner;

public class S_Reverse_String_3 {

	public static void main(String[] args) {

		// mthd1

		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		/*
		 * for (int i = str.length() - 1; i >= 0; i--) {
		 * System.out.print(str.charAt(i));
		 * 
		 * }
		 */
		// Mthd 2StringBuffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
