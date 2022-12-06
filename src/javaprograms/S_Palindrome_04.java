package javaprograms;

import java.util.Scanner;

public class S_Palindrome_04 {

	public static void main(String[] args) {

		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pali = num;
		int rev=0;

		/*
		 * for (int i = 0; i < num; i++) { pali=pali*10+num%10;//1234%10=4 40+123%10=3
		 * 430+12%10=2 432 num=num/10;//1234/10=123 123/10=12 12/10=1
		 * 
		 * }
		 */
		while (num != 0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if (rev == pali) {
			System.out.println("Given number is a palindrome");
		} else {
			System.out.println("Given number is Not a palindrome");
		}

	}
}
