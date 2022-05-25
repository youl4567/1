package com.callor.app.exec;

public class Exec1 {
	/*
	 * 랜덤 메서드 사용 1~ 100 임의의 정수 생성하여 변수에 저장
	 * 변수에 저장된 값이 짝수인지 홀수인지 판별하여 콘솔에 출력
	 * 이 과정을 10회 반복
	 */
	public static void main(String[] args) {
		
		for( int i = 0 ; i < 10 ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			if(num % 2 == 0) {
				System.out.println(num + " 은 짝수.");
			} else {
				System.out.println(num + " 은 짝수가 아니다.");
			}
		}
	}

}
