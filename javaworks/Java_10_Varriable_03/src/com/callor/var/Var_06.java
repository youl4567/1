package com.callor.var;

public class Var_06 {
	
	public static void main(String[] args) {
		 
		int num1 = 0;
		
		/*
		 * 변수++ 또는 ++변수 는
		 * 단독으로 사용될때는 연산결과가 똑같다
		 * 
		 * 하지만 다른 명령문 안에서 사용될 때는
		 * 성질이 매우 달라서 많은 주의가 필요하다.
		 * ++변수 : 가장 먼저 실행되는 명령이 된다.
		 * 변수++ : 모든 명령이 다 실행되고 다음 줄 명령문으로 진행하기 직전에 실행된다.
		 */
		
		System.out.println(++num1);
		System.out.println(num1++);
		
		num1 = 1;
		num1 = ++num1 * 3;
		System.out.println(num1);
		
		num1 = 1;
		num1 = num1++ * 3;
		System.out.println(num1++);
		System.out.println(num1);
		
		int num2 = num1 + 1;
		System.out.println(num2);
	}

}
