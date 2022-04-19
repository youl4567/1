package com.callor.classes.exec;

public class String2intV3 {

	public static void main(String[] args) {
		

		String strNum = "";
		if(strNum.equals("")) {
			System.out.println("숫자로 변환할 수 없음");
			
		} else {
		int intNum = Integer.valueOf(strNum);
		};
	
		/*
		 * 만약 키보드 등을 사용하여 값을 입력할 경우
		 * 은연중에 space 키를 눌러 white space가 담기는 경우가 발생할 것이다.
		 * space 키의 입력 횟수에 상관없이 모든 경우의 수를 if문을 통해 검사한다면
		 * 불필요한 코드를 많이 추가해야 된다.
		 */
		if(strNum.equals("  ")) {
			System.out.println("space 눈 숫자로 변환할 수 없음");
		}
	
	}
}
