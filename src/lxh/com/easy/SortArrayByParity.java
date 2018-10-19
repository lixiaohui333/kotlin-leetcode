package lxh.com.easy;

import java.util.Arrays;

public class SortArrayByParity {
	public static void main(String[] args) {
		
		sortArrayByParity(new int[] { 3, 1, 2, 4 });
	}

	private static void sortArrayByParity(int[] is) {
		int tempLeft = 0;
		int tempRight = 0;

		int left = 0;
		int right = is.length - 1;
		while (left < right) {
			while ((left < right) && (is[left] & 0b1) == 0) {
				left++;
			}
			tempLeft = is[left];
			while ((left < right) && (is[right] & 0b1) > 0) {
				right--;
			}
			tempRight = is[right];

			if (left < right) {
				is[left] = tempRight;
				is[right] = tempLeft;
				left++;
				right--;
			}
		}
		
		System.out.println(Arrays.toString(is));
	}
}
