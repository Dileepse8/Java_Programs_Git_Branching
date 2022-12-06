package javaprograms;

import java.util.Scanner;

public class S_ReverseNumber_02 {

	public static void main(String[] args) {

		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * int rev = 0; while (num != 0) { rev = rev * 10 + num % 10; // 0+1234%10=4 num
		 * = num / 10; // 1234/10=123 } System.out.println("Reverse number is: " + rev);
		 */

		// Method 2 stringbuffer
		/*
		 * StringBuffer st = new StringBuffer(String.valueOf(num)); StringBuffer rev1 =
		 * st.reverse(); System.out.println("Reverse number is: " + rev1);
		 */
		// Method 2 stringbuilder
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev2 = sb.reverse();
		System.out.println("Reverse number is: " + rev2);
	}

}
