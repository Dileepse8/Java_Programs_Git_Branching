package javaprograms;

import java.util.Scanner;

public class S_count_Digits_06 {

	public static void main(String[] args) {

		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 0;
		while (num > 0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits: "+count);

	}
}
