package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {
	public static void main(String[] args) {
		
		// 정수형 리스트를 생성
		List<Integer> nums = new ArrayList<>();
		
		// 1~100까지의 임의의 정수 100개를 생성하여 추가
		for( int i = 0 ; i < 100 ; i++) {
			nums.add((int)(Math.random() * 100) + 1 );
		}
		
		//리스트에 담긴 정수들 중 55 이상의 정수가 "최초로 몇 번째에서 나타나는지 위치와 함꼐 출력
		int count = 0;
		for( int num : nums) {
			if(num >=55) {
				System.out.printf("위치 : %d , 값 : %d", count, num);
				break;
			}
			count++;
		}
		
		
		
	}
}
