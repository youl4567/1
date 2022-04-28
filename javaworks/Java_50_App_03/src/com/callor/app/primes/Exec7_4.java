package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec7_4 {

	public static void main(String[] args) {
		

		int[] nums = new int[100];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random() * 100 ) +1;
		}
		int count = 0;
		for(int num : nums) {
			count+= prime(num);
		}
		count = 0;
		for(int i = 0 ; i <nums.length ; i++) {
			count += prime( nums[i] );
		}
		System.out.println("소수의 개수 : " + count);
	}
	/*
	 * 매개변수 전달받은 num 변수 값이
	 * 소수이면 1을 아니면 0을 리턴한다.
	 */
	public static int prime(int num) {
		for(int i = 2 ; i <num ; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
