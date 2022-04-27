package com.callor.app.exec;

public class Exec3 {

	/*
	 * 임의의 정수 10개를 만들어 각각의 수를 even() 메서드에 매개변수로 전달하고 
	 * even() 메서드는 매개변수로 전달받은 값이 짝수이면
	 * 전달받은 값, 아니면 0을 리턴 even() 메서드가 리턴한 값을 합산하여 출력
	 */
	public static void main(String[] args) {

		int intNums = 0;
		int intSum = 0;
		for(int i=0 ; i< 10 ; i++) {
			intNums = (int)(Math.random() * 100) +1;
			intSum += even(intNums);
		}
		System.out.println(intSum);
	}

	public static int even(int num) {
		boolean bEven = num % 2 == 0;
		if(bEven) {
			return num;
		}
		return 0;
	}
}