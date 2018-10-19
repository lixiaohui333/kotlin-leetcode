package lxh.com.easy;

public class HammingDistance {
	public static void main(String[] args) {

		hammingDistance(3, 31);
	}

	static public int hammingDistance(int x, int y) {

		int temp = x ^ y;
		int length = 1;
		while (x > 0 | y > 0) {

			x = x >> 1;
			y = y >> 1;
			length++;
		}

		int sum = 0;
		for (int i = 0; i < length; i++) {

			if (((1 << i - 1) & temp) > 0) {
				sum++;
			}

		}
		System.out.println("" + sum);
		return sum;
	}
}
