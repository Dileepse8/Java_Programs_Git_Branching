package javaprograms;

public class Anagrams {

	public static void main(String[] args) {
		
		boolean ye = isAnagram("aabf", "abf");
		if (ye == true) {
			System.out.println("Anagram");
		} else {
			System.out.println(" Not a Anagram");
		}

	}

	private static boolean isAnagram(String string1, String string2) {
		

		int count[] = new int[256];

		for (int i = 0; i < string1.length(); i++) {
			count[string1.charAt(i)]++;
			count[string2.charAt(i)]--;
			
		}
		
		for (int i = 0; i < count.length; i++) {
			
			if (count[i] != 0) {
				return false;
			}

		}
		return true;

	}
}

/*if (string1.length() != string2.length()) {
	System.out.println("length is missmatch");
	
}*/
