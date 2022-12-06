package javaprograms;

public class Reverse {

	public static void main(String[] args) {

		isReverse("welcome to abc hai ");
		
		

	}

	private static void isReverse(String str) {
		String ar[]=str.split(" ");
		
		for (int i=ar.length-1; i>=0; i--) {
			
			System.out.print(ar[i] +" ");
			//System.out.print(" ");
			
		}
		
	}

}
