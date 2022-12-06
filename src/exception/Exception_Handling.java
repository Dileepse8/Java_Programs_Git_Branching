package exception;

import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		System.out.println("Program Started");
		System.out.println("Program is Proceess!!!");
		
		System.out.println("Enter a Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		try {
			System.out.println(100/num);
		} catch (Exception e) {
			
			System.out.println("Exeception thrown");
		}
		System.out.println("completed");
		System.out.println("EXIT");
		
		
		

	}

}
