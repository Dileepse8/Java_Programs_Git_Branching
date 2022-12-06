package javaprograms;

public class EvenOrOdd {

	public static void main(String[] args) {
		isEvenOrOdd("My Life sucks");
	}

	private static void isEvenOrOdd(String str) {
		//Approch 1
		//String[] sss = str.split(" ");
		/*for (int i = 0; i < sss.length; i++) {

			if (sss[i].length() % 2 == 0) {
				System.out.println(sss[i]);
			}

		}*/
		for(String s: str.split(" ")) {
			if (s.length()%2==0) {
				System.out.println(s);
				
			}
		}

	}
	
}
