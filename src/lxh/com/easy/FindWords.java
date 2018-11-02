package lxh.com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords {

	public static void main(String[] args) {
		String[] out = findWords(new String[] { "Hello" });
		System.out.println(Arrays.toString(out));
	}

	public static String[] findWords(String[] words) {

		// Set<Integer> firstSet = new HashSet<>();
		// Set<Integer> secondSet = new HashSet<>();
		// Set<Integer> thirdSet = new HashSet<>();
		// for (char c : "qwertyuiopQWERTYUIOP".toCharArray()) {
		// firstSet.add((int) c);
		// }
		// for (char c : "asdfghjklASDFGHJKL".toCharArray()) {
		// secondSet.add((int) c);
		// }
		// for (char c : "zxcvbnmZXCVBNM".toCharArray()) {
		// thirdSet.add((int) c);
		// }

		String firstStr = "qwertyuiopQWERTYUIOP";
		String secondStr = "asdfghjklASDFGHJKL";
		String thirdStr = "zxcvbnmZXCVBNM";

		List<String> newWords = new ArrayList<>();

		int tempHash = 0;
		int selectHash = 0;
		for (String s : words) {
			boolean isOneLine = true;
			selectHash = 0;
			tempHash = 0;

			for (char c : s.toCharArray()) {
				tempHash = firstStr.indexOf(c) != -1 ? firstStr.hashCode() : tempHash;
				tempHash = secondStr.indexOf(c) != -1 ? secondStr.hashCode() : tempHash;
				tempHash = thirdStr.indexOf(c) != -1 ? thirdStr.hashCode() : tempHash;

				if (selectHash == 0) {
					selectHash = tempHash;
				}
				if (selectHash != tempHash) {
					isOneLine = false;
					break;
				}
			}

			if (isOneLine) {
				newWords.add(s);
			}

		}

		return (String[]) newWords.toArray(new String[newWords.size()]);
	}
	//
	// public static String[] findWords(String[] words) {
	//
	// Set<Integer> firstSet = new HashSet<>();
	// Set<Integer> secondSet = new HashSet<>();
	// Set<Integer> thirdSet = new HashSet<>();
	// for (char c : "qwertyuiopQWERTYUIOP".toCharArray()) {
	// firstSet.add((int) c);
	// }
	// for (char c : "asdfghjklASDFGHJKL".toCharArray()) {
	// secondSet.add((int) c);
	// }
	// for (char c : "zxcvbnmZXCVBNM".toCharArray()) {
	// thirdSet.add((int) c);
	// }
	//
	// Set<Integer> selectSet = null;
	// Set<Integer> tempSet = null;
	// List<String> newWords = new ArrayList<>();
	//
	// for (String s : words) {
	// boolean isOneLine = true;
	// selectSet = null;
	//
	// for (char c : s.toCharArray()) {
	// tempSet = firstSet.contains((int) c) ? firstSet : tempSet;
	// tempSet = secondSet.contains((int) c) ? secondSet : tempSet;
	// tempSet = thirdSet.contains((int) c) ? thirdSet : tempSet;
	//
	// if (selectSet == null) {
	// selectSet = tempSet;
	// }
	// if (selectSet != tempSet) {
	// isOneLine = false;
	// break;
	// }
	// }
	//
	// if (isOneLine) {
	// newWords.add(s);
	// }
	//
	// }
	//
	// return (String[]) newWords.toArray(new String[0]);
	// }
}
