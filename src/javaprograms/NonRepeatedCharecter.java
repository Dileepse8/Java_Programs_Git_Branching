package javaprograms;

import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Map.Entry;


public class NonRepeatedCharecter {

	public static void main(String[] args) {

		char c=isNonRepeatedCharecter("aabbcddg");
		System.out.println("Non Repeated Charecter is " +c);
	}

	private static Character isNonRepeatedCharecter(String str) {

		Map<Character, Integer> countmap = new LinkedHashMap<Character, Integer>(str.length());
		for (char ch : str.toCharArray()) {
			countmap.put(ch, countmap.containsKey(ch) ? countmap.get(ch) + 1 : 1);

		}
		for (Entry<Character, Integer> entry : countmap.entrySet()) {
			if (entry.getValue()==1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("did not find any non repeated Charecter");
	}

}
