package com.callor.app.exec;

public class Exec4 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지 임의의 수를 생성하고
		 */
		int num = (int) (Math.random() * 100) + 1;
		if (isPrime(num)) {
			System.out.println(num + " 소수다.");
		} else {
			System.out.println(num + " 소수가 아니다.");
		}

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; ++i) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}