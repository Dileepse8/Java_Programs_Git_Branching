package javaprograms;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cou=isCountWords(str);
		System.out.println(cou);

	}

	private static int isCountWords(String str) {
			
		int count=0;
		if (str.charAt(0)!=' ') {
			count++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				count++;
				//System.out.println("count of words in a String : "+count);
			}
		}
		return count;
	}

}
