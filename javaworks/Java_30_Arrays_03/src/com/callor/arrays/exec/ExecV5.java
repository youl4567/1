package com.callor.arrays.exec;

public class ExecV5 {

	public static void main(String[] args) {
		
		/*
		 * 1부터 100까지의 수를 덧셈하여 출력
		 */
		
		int intSum = 0;
		
		for( int i=0 ; i < 100 ; i++) {
			intSum += (i+1);

		}
		System.out.println(intSum);
	}
}
