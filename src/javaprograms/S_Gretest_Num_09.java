package javaprograms;

import java.util.Scanner;

public class S_Gretest_Num_09 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		int c=sc.nextInt();
		//method -01
		/*if(a>b && a>c) {
			System.out.println("A is big");
		}else if (b>c && b>a) {
			System.out.println("B is big");
		}else {
			System.out.println("C is big");
		}*/
		//method -02
		
		int large1=a>b?a:b;
		int large2=c>large1?c:large1;
		System.out.println(large2 +" is largest Number");
		
	}
}
