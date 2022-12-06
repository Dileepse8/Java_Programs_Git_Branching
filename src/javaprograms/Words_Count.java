package javaprograms;

public class Words_Count {

	public static void main(String[] args) {
		String str = "Hello Worldf";
		count(str);

	}

	private static void count(String str) {

		char[] ch = str.toCharArray(); // converting to Charecter Arry

		for (int i = 0; i < ch.length; i++) {
			String s = ""; // Declare a EmptyString
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];// concat with String
				i++;
			}
			if (s.length() > 0) {
				System.out.println(s + " length " + s.length());

			}

		}

	}

}
