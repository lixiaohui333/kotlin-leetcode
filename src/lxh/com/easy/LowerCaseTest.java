package lxh.com.easy;

public class LowerCaseTest {

	public static void main(String[] args) {
		toLowerCase("aAAbbbb");

		System.out.println("a:" + (int) 'a' + "  z:" + (int) 'z');
		System.out.println("A:" + (int) 'A' + "  Z:" + (int) 'Z');
	}

	private static void toLowerCase(String str) {

		StringBuilder sb = new StringBuilder();
		for (char item : str.toCharArray()) {
			if (item >= 'A' && item <= 'Z') {
				item += 32;

			}
			sb.append(item);

		}
		System.out.println(sb.toString());

	}
}
