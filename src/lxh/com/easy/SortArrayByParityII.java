package lxh.com.easy;

import java.util.Arrays;
import java.util.Stack;

public class SortArrayByParityII {

	public static void main(String[] args) {

		int[] a = { 4, 2, 5, 7};
		a = sortArrayByParityII(a);

		System.out.println(Arrays.toString(a));
	}

	public static int[] sortArrayByParityII(int[] A) {
		int newA[] = new int[A.length];

		int oddNumIndex = 0;
		int evenNumIndex = 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				newA[oddNumIndex] = A[i];
				oddNumIndex += 2;
			} else {
				newA[evenNumIndex] = A[i];
				evenNumIndex += 2;
			}

		}

		return newA;
	}
	//
	//
	//
	// public static int[] sortArrayByParityII(int[] A) {
	// Stack<Integer> oddNum=new Stack<Integer>();
	// Stack<Integer> evenNum=new Stack<Integer>();
	// for (int i = 0; i < A.length; i++) {
	//
	// if(A[i]%2==0){
	// //ÆæÊý
	// oddNum.push(A[i]);
	// }else{
	// //Å¼Êý
	// evenNum.push(A[i]);
	// }
	// }
	// for (int i = 0; i < A.length; i++) {
	// A[i]= i%2==0 ? oddNum.pop():evenNum.pop();
	// }
	// return A;
	// }

}
