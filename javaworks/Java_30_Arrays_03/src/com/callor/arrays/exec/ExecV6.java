package com.callor.arrays.exec;

public class ExecV6 {

	public static void main(String[] args) {

		/*
		 * 정수형 배열 100개 선언 1~100 임의의 수 생성 후 각 요소에 저장 
		 * 배열의 각 요소에 저장된 수 중에서 짝수의 리스트를 5개씩 끊어서 출력
		 */
		int[] intNums = new int[100];

		for (int i = 0; i < 100; i++) {
			intNums[i] = (int) (Math.random() * 100) + 1;
		}

		int intCount = 0;
		for (int i = 0; i < 100; i++) {
			boolean bEven = intNums[i] % 2 == 0;
			if (bEven) {
				System.out.print("\t" + intNums[i] + ",");
				intCount++;
				if (intCount % 5 == 0) {
					System.out.println();
				}

			}

		}
	}

}
