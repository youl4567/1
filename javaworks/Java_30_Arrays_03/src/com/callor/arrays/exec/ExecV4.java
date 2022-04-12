package com.callor.arrays.exec;

public class ExecV4 {

	public static void main(String[] args) {
		/*
		 * 정수형 배열 100개 선언하고 1~100까지 임의의 수를 생성하고 각 요소에 저장 배열의 요소 중 짝수만을 모두 더하여 결과를 출력
		 */

		int[] intNums = new int[100];
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		int intEvenSum = 0;
		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = false;
			bEven = intNums[i] % 2 == 0;
			if (bEven) {
				intEvenSum += intNums[i];
			}
		}
		System.out.println(intEvenSum);
	}
}
