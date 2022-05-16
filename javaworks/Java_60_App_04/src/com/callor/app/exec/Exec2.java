package com.callor.app.exec;

public class Exec2 {
/*
 * 정수형 배열 10개 선언
 * 1~100 임의의 정수 생성 배열에 저장
 * 배열에 저장된 수 중 짝수의 개수와 짝수의 합을 구하여 출력
 */
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		// 배열에 값을 채워 넣는 부분
		for( int i = 0 ; i < nums.length ; i++ ) {
			nums[i] = (int)(Math.random() * 100) + 1; 
		}
		
		// 연산하는 부분
		int count = 0;
		int sum = 0;
		for(int i = 0 ; i<10 ; i++) {
			if(nums[i] % 2==0) {
				sum += nums[i];
				count++;
			}
		}
		System.out.println("짝수의 개수 : " + count);
		System.out.println("짝수의 합 : " + sum);
			
				
		
	}
}
