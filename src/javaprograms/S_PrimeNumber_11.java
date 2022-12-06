package javaprograms;

import java.util.Scanner;

public class S_PrimeNumber_11 {

	public static void main(String[] args) {
		// num should be greater than 1 and it should  two factors
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int count=0;
		if (num>1) {
			
			for (int i = 1; i <=num; i++) {
				
				if (num%i==0) {
					count++;
				}
				
				if (count==2) {
					System.out.println("Given number is PRIME Number!.");
				}
				else {
					System.out.println("Given number is NOT a PRIME Number!.");
				}
					
			}
			
			
		}
		else {
			System.out.println("NOT a Prime Number");
		}

	}

}
