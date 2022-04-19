package com.callor.classes.exec;

public class String2intV1 {

	public static void main(String[] args) {
		
		String strNum1 = "100";
		String strNum2 = "200";
		
		String strSum = strNum1 + strNum2;
		System.out.println(strSum);
		
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
		
		
		
	}
}
