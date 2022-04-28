package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec5_A {
	public static void main(String[] args) {
		
		// 정수형 리스트 생성
		List<Integer> nums = new ArrayList<>();
		
		// 1~100까지 임의의 정수 100개 생성하여 리스트에 추가
		for( int i = 0; i < 100 ; i++) {
			nums.add((int)(Math.random() * 100) + 1);
		}
		
		// 리스트에 담긴 정수들 중 "가장 큰 값"이 나타나는 위치와 값을 함께 출력
		int count = 0;
		int maxValue = 0;
		int maxCount=0;
		
		for(int num : nums) {
			if(num > maxValue) {
				maxValue = num;
				maxCount = count;
			}
			count++;
		}
		System.out.printf("%d, %d", maxCount, maxValue);
		
	}
}
