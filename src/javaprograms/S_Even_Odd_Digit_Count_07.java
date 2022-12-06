package javaprograms;

import java.util.Scanner;

public class S_Even_Odd_Digit_Count_07 {

	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int Ev_Cout = 0;
		int Od_Cout = 0;
		int rev;
		while (num > 0) {
			rev = num % 10;
			if (rev%2==0) {
				Ev_Cout++;
			}else {
				Od_Cout++;
			}
			num=num/10;
		}
		System.out.println("Even Count "+Ev_Cout + " and Odd Count "+Od_Cout);
	}
}
