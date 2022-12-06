package javaprograms;

public class Compare_Strings {

	public static void main(String[] args) {

		String s1 = "Dileepe";
		String s2 = "Dileewp";
		boolean isCompare = false;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				isCompare = false;

				break;
			}
			isCompare = true;

		}
		System.out.println("both are Equal " + isCompare);

	}

}
