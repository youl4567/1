package com.callor.app.exec;

public class Exec1 {
	public static void main(String[] args) {

		// 정수형 배열 100개를 선언
		int[] nums = new int[100];

		// 각 요소에 1~100까지의 임의의 정수 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}

		// 각 배열 요소에 담긴 정수 중 55보다 큰 수의 리스트 전체를 출력
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 55) {
				System.out.println(nums[i]);
			}
		}

	}
}
