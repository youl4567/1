package com.callor.arrays.exec;

public class ExecV1 {
/*
 * Math.random 을 사용하여
 * 1~100까지 임의의 수를 생성하고
 * 생성한 수가 짝수인가 홀수인가 판별하는 코드를 작성
 */
	
	public static void main(String[] args) {
		
		
		int intNums = (int)(Math.random() * 100) +1;
		
		if(intNums % 2 == 0) {
			System.out.println(intNums + "는 짝수이다.");
		} else {
			System.out.println(intNums + "는 짝수가 아니다.");
		}
		
		
		
		boolean bEven = false;
		// intNum 변수를 2로 나눈 나머지가 0이냐?
		// intNum 변수에 담긴 값을 2로 나눈 나머지가 0이냐?
		// 0이면 true가 bEve 에 저장, 아니면 false 가 bEven 저장된다.
		bEven = intNums % 2 == 0;
		
		if(bEven) {
			System.out.println(intNums + "는 짝수이다.");
		} else {
			System.out.println(intNums + "는 짝수가 아니다.");
		}
		
	}
}
