package javaprograms;

import java.util.Map;
import java.util.TreeMap;

public class PrintWordsDemo {

	public static void main(String[] args) {
		String str = "Learn JAVA with Dileep.";
		PrintWordsDemo pm = new PrintWordsDemo();
		pm.printwordsvowel(str);
		pm.printfrequency(str);

	}

	private void printfrequency(String str) {
		int wordcount = 0;
		int vowlcount = 0;
		int uppercount = 0;
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			switch (c) {
			case ' ':
			case '.':
				wordcount++;
			}

			switch (c) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowlcount++;
			}
			if (c >= 65 && c <= 90) {
				uppercount++;
			}

		}
		System.out.println("wordcount " + wordcount);
		System.out.println("vowlcount " + vowlcount);
		System.out.println("uppercount " + uppercount);
	}

	private void printwordsvowel(String str) {

		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {

			int c = map.get(str.charAt(i));
			if (map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), ++c);
			}

		}
		for (
		Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Character : " + entry.getKey());
			System.out.println("Frequency : " + entry.getValue());
		}
	}

}
