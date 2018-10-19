package lxh.com.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {

	public static void main(String[] args) {

		int size = uniqueMorseRepresentations(new String[] { "gin", "zen", "gig", "msg" });

		System.out.println("size:" + size);
	}

	public static int uniqueMorseRepresentations(String[] words) {
		String[] azs = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Set<String> mSet = new HashSet<>();
		StringBuilder sb = null;
		for (String key : words) {
			sb = new StringBuilder();
			for (char c : key.toCharArray()) {
				int value = c - 'a';
				sb.append(azs[value]);
			}
			mSet.add(sb.toString());
		}

		return mSet.size();
	}
}
