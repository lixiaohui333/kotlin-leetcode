package lxh.com.easy;

public class FindComplement {
	
	
	public static void main(String[] args) {
		System.out.println("findComplement:"+findComplement(5));
		
		
		
	}

//	public static int findComplement(int num) {
//		
//		return ~num & ((Integer.highestOneBit(num) << 1) - 1);
//	}
	
	public static int findComplement(int num) {
		
		int original=num;
		int index = 0;
		while(num>0){
			num=num>>1;
		index++;
		}
		
		int allNum = (1<<index) -1;
		
		return allNum^original;
	}
}
