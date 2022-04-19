package com.callor.classes.exec;

public class String2intV4 {
	
	public static void main(String[] args) {
		
		// 숫자 앞에 + 또는 - 가 있는 경우는 정상 변환 된다
		String strNum = "-3";
		strNum = "+3";
		
		// +, - 이외의 기호는 numberFormatException 발생
		strNum = "*3";
		int intNum = Integer.valueOf(strNum);
	}

}
