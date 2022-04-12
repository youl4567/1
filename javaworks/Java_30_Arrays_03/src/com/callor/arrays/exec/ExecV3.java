package com.callor.arrays.exec;

public class ExecV3 {

	public static void main(String[] args) {

		/*
		 * 정수형 배열 100개를 선언하고 Math.random 을 사용하여 1~100까지 임의의 수를 생성하고 각각 요소에 저장 배열의 각 요소에
		 * 저장된 수 중에서 짝수가 몇 개 인지 판별하여 출력하시오.
		 */

		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}
		
		int intEven = 0;
		
		for (int i = 0; i < intNums.length; i++) {
			boolean bEven = false;
			bEven = intNums[i] % 2 == 0;

			if (bEven) {
				intEven = intEven + 1;
			}
		}
		System.out.println(intEven);

	}
}
