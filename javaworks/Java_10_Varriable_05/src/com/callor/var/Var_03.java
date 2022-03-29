package com.callor.var;

public class Var_03 {
	public static void main(String[] args) {
		
		// douNum1 : 0.000 ~ 0.999 범위의 실수가 생성되어 저장
		double douNum1 = 0.0;
		double douNum2 = 0.0;
		
		/*
		 *  Math.random() 이 실행된 결과가 담긴 douNum1 변수의 값에
		 *  1000을 곱하여 다시 douNum1 에 저장하라
		 *  douNum1 = douNum1 * 1000; 과 같다
		 *  douNum1 = 0.000~ 999.999 범위의 실수가 저장
		 */
		douNum1 *= 1000;
		douNum1 = Math.random() * 1000;
		douNum2 = Math.random() * 1000;
		/*
		 * douNum1 에 담긴 값에 1을 더하여 다시 douNum1 에 저장
		 * douNum1 : 1.000~ 1000.999 범위의
		 */
		douNum1 ++;
		douNum2 ++;
		// 정수 값으로 변환
		// intNum1 : 1~1000 범위의 정수가 저장
	
		
		// 0~999 -> 1~1000
		System.out.println(douNum1++);
		System.out.println(douNum2++);
		
		int intNum1 = (int)douNum1;
		int intNum2 = (int)douNum2;
		
		System.out.println("==================================");
		
		System.out.println(intNum1 + intNum2);
		System.out.println(intNum1 - intNum2);
		System.out.println(intNum1 * intNum2);
		System.out.println(intNum1 / intNum2);
		
		System.out.printf("\t%8.2f", douNum1);
	}
	
}
