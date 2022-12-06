package javaprograms;

public class S_Evn_Od_Num_Array_15 {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,6,7,9,13,8};
		
		/*for (int i : a) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers :");
		for (int i : a) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}*/
		
		//M-2
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i]);
			}
			
		}
		System.out.println("Odd numbers :");
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.println(a[i]);
			}
			
		}

	}

}
