package lxh.com.easy;

public class GemTest {

	public static void main(String[] args) {
		numJewelsInStones("aA","aAAbbbb");
	}

	private static int numJewelsInStones(String J, String S) {
		
		int sum = 0;
		for (char item : S.toCharArray()) {
			
			for (char temp : J.toCharArray()) {
				if(temp == item){
					sum++;
				}
			}
		}
		System.out.println(""+sum);
		return sum;
		
	}
}
