package lxh.com.easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public static void main(String[] args) {

		System.out.println(selfDividingNumbers(2, 22));
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();

		for (int i = left; i < right + 1; i++) {

			if (isSelfDividingNum(i, i))
				list.add(i);

		}

		return list;
	}

	public static boolean isSelfDividingNum(int i, int key) {
		if (key == 0)
			return true;
		if((key%10)==0)
			return false;
		if (i % (key%10) != 0)
			return false;

		return isSelfDividingNum(i, key / 10);
	}

	//
	// public static List<Integer> selfDividingNumbers(int left, int right) {
	// List<Integer> list = new ArrayList<>();
	//
	// int temp = 0;
	// int tempItem = 0;
	// boolean isSelfDividingNum = true;
	// for (int i = left; i < right + 1; i++) {
	//
	// if ((i + "").indexOf("0") > -1) {
	// continue;
	// }
	//
	// isSelfDividingNum = true;
	// temp = i;
	//
	// while (temp > 0) {
	// tempItem = temp % 10;
	// if (i % tempItem != 0) {
	// isSelfDividingNum = false;
	// break;
	// }
	// temp /= 10;
	// }
	//
	// if (isSelfDividingNum)
	// list.add(i);
	//
	// }
	//
	// return list;
	// }
}
