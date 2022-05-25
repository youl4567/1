package com.callor.app.exec;

public class Exec3 {

	/*
	 * 정수형배열 10개 선언
	 * 1~100까지 임의의 정수를 생성하여 배열에 저장
	 * 배열의 리스트를 보여주고
	 * 
	 */
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		for( int i = 0 ; i < nums.length ; i++) {
			
			nums[i] = (int)(Math.random() * 100) + 1;
			
		}
		for(int num : nums) {
			System.out.println(num);
		}
	}
}
