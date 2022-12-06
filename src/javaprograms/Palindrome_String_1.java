package javaprograms;

import java.util.Scanner;

public class Palindrome_String_1 {

	public static void main(String[] args) {
		// mam=mam
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String orgl = sc.nextLine();
		String palin="";
		for (int i = orgl.length() - 1; i >= 0; i--) {
			palin=palin+orgl.charAt(i);
		}
		if (orgl.equals(palin)) {
			System.out.println("PALINDROME!");
		}else
			System.out.println(" Not A PALINDROME!..");

	}

}
