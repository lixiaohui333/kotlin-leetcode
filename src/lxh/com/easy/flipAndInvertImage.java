package lxh.com.easy;

import java.util.Arrays;

public class flipAndInvertImage {

	public static void main(String[] args) {
		flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}});
	}

	static public int[][] flipAndInvertImage(int[][] A) {
        
		for (int[] is : A) {
			
			for (int i=0;i<is.length;i++) {
				if(i< is.length-i){
					swipInt(is, i, is.length-i-1);
				}
				is[i] =(is[i]+1)&1;
				
			}
		}
		System.out.println(Arrays.toString(A));
		
		return A;
    }
	
	   public int[][] flipAndInvertImage2(int[][] A) {
	        int x = A.length, y = A[0].length;
	        int[][] B = new int[x][y];
	        for (int i = 0; i < x; i++) {
	            for (int j = 0; j < y; j++) {
	                B[i][j] = A[i][y - 1 - j] ^ 1;
	            }
	        }
	        return B;
	    }
	   
	
	static public void swipInt(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}
