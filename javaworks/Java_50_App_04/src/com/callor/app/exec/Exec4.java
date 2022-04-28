package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {
	public static void main(String[] args) {
		
		// 정수형 리스트 생성
		List<Integer> nums = new ArrayList<>();
		
		// 1~100 까지 임의의 정수 100개 생성하여 추가
		for(int i = 0 ; i < 100 ; i++) {
			nums.add((int)(Math.random() * 100) +1);
		}
		
		// 리스트에 담긴 정수들 중 55 이상의 정수가 "가장 마지막"으로 나타난 경우를 위치와 함께 출력
		int count = 0;
		int last = 0;
		int lastCount = 0;
		for(int num : nums) {
			if(num >= 55) {
				last = num;
				lastCount = count;
			}
			count++;
		}
		System.out.printf("%d, %d", lastCount, last);
		
		// for index를 역순으로 진행하기
		for(int i = size -1 ; i < -1 ; i--) {
			if(nums.get(i) >= 55) {
				System.out.printf("%3d 번째 %3d", i, nums.get(i));
				break;
			}
		}
		
	}
	
	
}
