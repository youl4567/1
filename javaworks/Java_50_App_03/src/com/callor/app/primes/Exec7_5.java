package com.callor.app.primes;

import java.util.ArrayList;
import java.util.List;

public class Exec7_5 {

	public static void main(String[] args) {
		

		List<Integer> nums = new ArrayList<>();
		for(int i = 0 ; i <100 ; i++) {
			int num = (int)(Math.random() * 100) + 2;
			nums.add(num);
		}
		int count = 0;
		int size = nums.size();
		for(Integer i = 0 ; i < size ; i++) {
			count += prime(nums.get(i));
		}
		for(Integer num : nums) {
			count += prime(num);
		}
		System.out.println("소수의 개수 : " +  count);
	}
	
	public static Integer prime(Integer num) {
		for(int i = 0 ; i < num ; i++) {
			if(num % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
