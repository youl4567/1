package com.callor.app;

public class Exec1 {

	public static void main(String[] args) {
		
		// 학생 25명에게 간식을 주려고 한다. 피자를 원한다.
		
		// 피자는 "한 판에 6개의 조각"으로 되어 있다.
		
		// 6개 조각의 피자를 25명이 부족하지 않게 나눠 먹으려면 최소 5판을 주문해야 한다.
		
		// random() 메서드를 사용하여 25~50명의 임의의 학생 수를 생성하고, 주문할 피자 판 수를 계산하는 코드를 구현해봅니다.
		
		int intNums = 0;
		while(intNums < 24) {
			intNums = (int)(Math.random() * 50) +1;
		}
		System.out.println("학생 수 : " + intNums);

		int intP = 0;
		if( intNums % 6 == 0) {
			System.out.println("필요한 피자 수 : " + (intNums/6));
		} else {
			intP = (intNums / 6) +1;
			System.out.println("필요한 피자 수 : " + (intP));
		}
		
	}
}
