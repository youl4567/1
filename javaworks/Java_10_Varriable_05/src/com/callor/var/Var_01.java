package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		
		// 실수형(double) 형으로 선언을 할 경우 0보다는 0.0처럼
		// 명확하게 표현하는 것이 좋다.
		double num1 = 0.0;
		double num2 = 0.0;
		
		num1 = Math.random() * 1000;
		num2 = Math.random() * 1000;
		
		System.out.println(num1);
		System.out.println(num2);
			
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
	}
	
	
}
