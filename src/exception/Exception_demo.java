package exception;

import java.util.Scanner;

public class Exception_demo {

	public static void main(String[] args) {
		System.out.println("Program started");
		System.out.println("Program is in Progress!!!");
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number :" );
		int num=sc.nextInt();
		System.out.println(1000/num);
		*/
		int a[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		System.out.println("Enter a number position : ");
		int pos=sc.nextInt();
		a[pos]=num;
		System.out.println(a[pos]);
		
		
		System.out.println("Program Completed");
		System.out.println("Program Completed and Exited!!!");
	}

}
