package com.callor.arrays;

public class ArraysV5 {

	public static void main(String[] args) {

		int[] intScore = new int[100];

		// 각 배열 요소에 1~100 까지 임의의 점수 저장
		int index = 0;
		for (index = 0; index < intScore.length; index++) {
			intScore[index] = (int) (Math.random() * 100) + 1;
		}
		// 저장된 점수를 한 라인에 5개 씩 출력
		/*
		 * intScore 배열에 담긴 for() 문을 사용하여
		 * 각 요소별로 한 줄로 출력하다가
		 * 5번째 요소를 출력한 후 Enter(new line, plrintln() ) 을 하라
		 * i(index) 값을 5로 나눈 나머지가 0이 될 때 println() 을 실행하여 new line 을 부여한다.
		 * 그런데 i 값을 0부터 시작한다. 0 % 5 의 결과는 0이 되어
		 * 처음 요소를 출력한 후 new line 이 되어버린다.
		 * 그래서 i+1 을 먼저 실행하여 index % 5 의 연산을 1 부터 시작하도록 하여준다.
		 */
		for (index = 0; index < intScore.length; index++) {
			System.out.print(intScore[index] + ", \t");
			
			if( (index+1) % 5 == 0) {
				System.out.println();
			}
		}
		/*
		 * for(int i = 0 ; i < 10 ; i++) { System.out.println("대한민국"); }
		 */
	}
}
