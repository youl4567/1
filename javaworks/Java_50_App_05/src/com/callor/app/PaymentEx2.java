package com.callor.app;

public class PaymentEx2 {
public static void main(String[] args) {
	
	int pay = 3_829_980;
	int money = 50000;
	boolean sw = true;  // boolean 스위치..
	
	while(pay > 0) {
		
		int paper = pay / money;
		System.out.printf("%7d 권: %5d 매", money, paper);
		
		pay -= paper * money;
		if(sw) {
			money = money / 5;
		} else {
			money = money / 2;
		}
		sw = !sw;	// 스위치 변수 반전..
		
	}
	
	
	
}
}
