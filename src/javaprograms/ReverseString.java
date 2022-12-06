package javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Dileep kumar";
		String[] str1=str.split(" ");
		
		
		for (int i=str1.length-1;i>=0; i--) {
			System.out.print(str1[i]+ " ");
			
			
		}
		System.out.println(" ");
		for (int i=str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
		}

	}

}
