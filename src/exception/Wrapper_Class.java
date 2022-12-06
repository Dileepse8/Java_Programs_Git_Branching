package exception;

public class Wrapper_Class {
	public static void main(String[] args) {
		byte a = 10;
		int b = 20;
		boolean c = true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		Byte aa = a;
		Integer bb = b;
		Boolean cc = c;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		String ab = "10";
		String ba = "22";
		System.out.println("be 4 wrapper");
		System.out.println(ab + ba);
		System.out.println("after 4 wrapper");
		System.out.println(Integer.parseInt(ab)+Integer.parseInt(ba));
	}

}
