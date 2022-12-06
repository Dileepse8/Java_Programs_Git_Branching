package javaprograms;

public class String_Concat {

	public static void main(String[] args) {
		String s1="123";
		String s2="100";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		
		System.out.println(sum);
		System.out.println(String.valueOf(sum));
	}

}
