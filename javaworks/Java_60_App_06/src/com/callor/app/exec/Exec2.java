package com.callor.app.exec;

public class Exec2 {
	
	public static void main(String[] args) {
		
		// 예제 코드를 사용하여 1~100까지 정수를 덧셈하여 출력
		int intSum = 0;
		int index;
		for (index = 0; index < 100 ; index++) {
			intSum += index + 1;
		}
		
		System.out.println("1 ~ 100 까지 정수의 덧셈결과 : " + intSum);
	}

}
