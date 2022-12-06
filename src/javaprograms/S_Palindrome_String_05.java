package javaprograms;

import java.util.Scanner;

public class S_Palindrome_String_05 {

	public static void main(String[] args) {

		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String pali = str;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (pali.equals(rev)) {
			System.out.println("Given String is a Palindrome");
		}else {
			System.out.println("Given String is Not a Palindrome");
		}
	}

}
