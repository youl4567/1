package com.callor.controller;

public class Method_01 {
/*
 *  num() 를 선언하고 1~100까지 범위의
 *  임의의 정수 2개를 만든 후 두 수를 덧셈하여
 *  결과를 return
 *  
 *  main() 에서 num()을 호출하여 변수를 선언하여
 *  콘솔에 결과값을 출력
 */
	public static void main(String[] args) {
		
		int intSum = num();
		
			System.out.println(intSum);
		
		
	}
	
	public static int num() {
		
		int intNum1 = (int) ((Math.random() * 100) + 1) ;
		int intNum2 = (int) ((Math.random() * 100) + 1) ;
		
		int intSum = intNum1 + intNum2;
		
		return intSum;
				
				
		
	}
}
