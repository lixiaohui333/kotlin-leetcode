package lxh.com.easy;

public class ReverseString {
	public static void main(String[] args) {

		System.out.println(reverseString("A man, a plan, a canal: Panama"));;
	}

	public static String reverseString(String s) {

		char[] sChar = s.toCharArray();
		int i = 0;
		int j = sChar.length - 1;
		char temp;

		while (i < j) {

			temp = sChar[i];
			sChar[i] = sChar[j];
			sChar[j] = temp;

			i++;
			j--;
		}

		return new String(s);
	}
	//
	// public static String reverseString(String s) {
	//
	// return new StringBuilder(s).reverse().toString();
	// }
}
