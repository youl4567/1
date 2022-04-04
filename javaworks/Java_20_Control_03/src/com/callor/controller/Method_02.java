package com.callor.controller;

public class Method_02 {
	
	public static void main(String[] args) {
		
		int intAdd = add();
		long longMulti = multi();
		
		System.out.println(intAdd + longMulti);
		
	}

	public static int add() {
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		
		int intAdd = intNum1 + intNum2;
		
		return intAdd;
	}
	
	public static long multi() {
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		int intNum2 = (int)(Math.random() * 100) + 1;
		
		long longMulti = intNum1 * intNum2;
		
		return longMulti;
	}
}
