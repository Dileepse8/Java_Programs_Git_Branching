package javaprograms;

import java.util.Arrays;

public class S_Array_Equals_16 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };

		/*
		 * boolean st = Arrays.equals(a, b); if (st==true) {
		 * System.out.println("Both are equal");
		 * 
		 * } else System.out.println("Both are not equal");
		 */
		//M-2
		boolean sta = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					sta = false;
				}

			}

		} else {
			sta = false;
		}
		if (sta == true) {
			System.out.println("Both are equal");
		} else
			System.out.println("Both are  not equal");
	}
}
