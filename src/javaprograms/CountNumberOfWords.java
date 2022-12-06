package javaprograms;

import java.util.Scanner;

public class CountNumberOfWords {

	public static void main(String[] args) {
		
		System.out.println("Enter a String: "); //hello hai world
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int count=isCountNumberOfWords(s);
		System.out.println("count of words in a string : "+count);

	}

	private static int isCountNumberOfWords(String s) {
		int count=0;
		if (s.charAt(0)!=0) {
			count++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				count++;
				
			}
			
		}
		return count;
		
	}

}
