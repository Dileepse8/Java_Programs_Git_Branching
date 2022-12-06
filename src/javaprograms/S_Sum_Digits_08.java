package javaprograms;

import java.util.Scanner;

public class S_Sum_Digits_08 {

	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			int rev = num % 10; // 123%10=3
			sum=sum+rev;
			num=num/10; //123/10=12
		}
		System.out.println("Sum of the Digits : "+sum);

	}
}
