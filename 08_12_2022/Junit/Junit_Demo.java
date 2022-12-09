package com.bookutil;



public class Junit_Demo {
	public static int max(int[] sourav) {
		int max= 0;                                 // or  // int max= sourav[0];
	                                               //	 int max= Integer.MIN_VALUE;
		for(int i=1; i<sourav.length; i++) {
			if(max<=sourav[i]) {
				max= sourav[i];
			}
			System.out.println("Max : "+max);
		}
		return max;
	}
}