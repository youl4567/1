package com.callor.app;

public class Exec2 {
	public static void main(String[] args) {
		
		/*
		 * 대한민국 통화 5만원, 1만원, 5천원, 1천원 500원, 100원 50원, 10원권이 있다.
		 * 급여를 현금으로 지급하기 위한 최소한의 액면권 개수를 구하자.
		 * 급여 금액을 임의로 정하고 액면권 개수를 계산하여 출력
		 */
		double wage = (int)(Math.random() *10000000) + 1;
		
		
		
		System.out.println("월급 : " + wage);
		int intW = 50000;
		for(int i = 0 ; i < 7 ; i++) {
			wage
			if(i % 2 == 0 ) {
				intW = intW / 5;
			} else {
				intW = intW / 2;
			}
			
			num[i] = (int)(wage/(w[i]));
			wage= (int)(wage-(w[i] * num[i]));
		}
		System.out.println("5만원 권 수량 : " + num[0]);
		System.out.println("1만원 권 수량 : " + num[1]);
		System.out.println("5천원 권 수량 : " + num[2]);
		System.out.println("1천원 권 수량 : " + num[3]);
		System.out.println("500원 권 수량 : " + num[4]);
		System.out.println("100원 권 수량 : " + num[5]);
		System.out.println("50원 권 수량 : " + num[6]);
		System.out.println("10원 권 수량 : " + num[7]);

		
		// int t5m = (int)(wage/int5m);
		// int t5m = (int)(wage/int5m);
		// wage = (int)(wage - (50000 * t5m));
		
		
		/*
		 * 
		 * 
		 * int t1m = (int)(wage/int1m); System.out.println("1만원 권 수량 : " + t1m); wage =
		 * (int)(wage - (10000 * t1m));
		 * 
		 * int t5c = (int)(wage/int5c); System.out.println("5천원원 권 수량 : " + t5c); wage =
		 * (int)(wage - (5000 * t5c));
		 * 
		 * int t1c = (int)(wage/int1c); System.out.println("1천원 권 수량 : " + t1c); wage =
		 * (int)(wage - (1000 * t1c));
		 * 
		 * int t5b = (int)(wage/int5b); System.out.println("500원 권 수량 : " + t5b); wage =
		 * (int)(wage - (500 * t5b));
		 * 
		 * int t1b = (int)(wage/int1b); System.out.println("100원 권 수량 : " + t1b); wage =
		 * (int)(wage - (100 * t1b));
		 * 
		 * int t10 = (int)(wage/int10); System.out.println("10원 권 수량 : " + t10); wage =
		 * (int)(wage - (10 * t10));
		 */
	}
}
