package com.callor.arrays.exec;

public class ExecV6A {
	/*
	 * 변수 scope 변수, 인스턴스, 메서드 등은 선언된 위치, 접근제한자 설정에 따라 외부에서 접근 하는 방식이 다르다. main
	 * method 에서 선언된 intnum 변수는 main method 블럭( {} ) 이 종료되면 소멸된다. for() 명령문에 선언된 변수
	 * i와 for() 명령 블럭 ( {} ) 에 선언된 intSum은 for() 명령문 블럭 ( {} ) 이 끝나면 사용할 수 없다.
	 */
	public static void main(String[] args) {
		/*
		 * 정수형 배열 100개 선언 1~100 임의의 수 생성 후 각 요소에 저장 
		 * 배열의 각 요소에 저장된 수 중에서 짝수의 리스트를 5개씩 끊어서 출력
		 */
		
		int[] intNums = new int[100];
		for(int i= 0 ; i< intNums.length ; i++ ) {
			intNums[i] = (int)(Math.random() * 100) + 1;
		}
		/*
		 * 짝수를 5번 출력하고 Enter 를 출력하여 줄바꿈하기
		 * i 변수를 사용하여 횟수를 구분하면 홀수일때, 짝수일때 상관없이
		 * i 변수값은 변화를 하기 때문에 문제가 발생한다.
		 * 
		 * 짝수를 출력할 때마다 출력한 횟수를 저장할 변수가 필요하다.
		 * 별도로 짝수를 출력할 때마다 출력한 횟수를 저장할 변수를
		 * for() 명령문 이전에 선언을 해 주어야 한다.
		 */
		int intEvenPrintCount = 0;
		for(int i= 0 ; i< intNums.length ; i++ ) {
			boolean bEven = intNums[i] % 2 == 0;
			if(bEven) {
				System.out.print("%d\t, intNums[i");
				// 짝수를 출력한 후 출력한 횟수를 1 증가시키키
				intEvenPrintCount++;
				
				// 짝수를 출력한 횟수가 5가 되면 줄바꿈한다.
				if(intEvenPrintCount % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}












