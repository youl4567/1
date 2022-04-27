package com.callor.app.exec;

public class Exec7 {
	public static void main(String[] args) {

 
		
	// 정수형 배열 선언
	int[] intNums = new int[100];
	int intPrime = 0;
	int intNotPrime = 0;

	// 각 요소에 2~101까지 임의의 정수 저장
	for(int i = 0; i < intNums.length ; i++) {
		intNums[i] = (int)(Math.random() * 100) + 2;
	}
	
	// 각 배열 요소에 담긴 정수 중 소수의 개수를 세어 출력
	for(int i =0 ; i < intNums.length ; i ++) {
		if(isPrime(intNums[i])) {
			intPrime++;
		} else {
			intNotPrime++;
		};
	}
	System.out.println("소수의 개수는 : " + intPrime);
	System.out.println("소수가 아닌 개수는 : " + intNotPrime);
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; ++i) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
