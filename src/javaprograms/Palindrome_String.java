package javaprograms;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String orgl = sc.nextLine();
		String pali = "";

		for (int i = orgl.length() - 1; i >= 0; i--) {
			
			pali=pali+orgl.charAt(i);
		}
		if (orgl.equals(pali)) {
			System.out.println("Given String is PALINDOME");
		}else {
			System.out.println("Not A PALINDROME!!!...");
		}
	}
}
