package com.callor.classes.utils;

import com.callor.classes.service.ScoreServiceV3;

public class ControllerV3 {
	public static void main(String[] args) {
		

		ScoreServiceV3 sV3 = new ScoreServiceV3();
		sV3 = new ScoreServiceV3(20);
	
		/*
		 * String[] strNames = new String[5]; 
		 * strNames[0] = "홍길동";
		 * strNames[1] = "이몽룡";
		 * strNames[2] = "성춘향"; 
		 * strNames[3] = "임꺽정"; 
		 * strNames[4] = "장보고";
		 */
		String[] strNames = {"홍길동", "이몽룡", "성춘향", "임꺽정", "장보고"}; 
		sV3 = new ScoreServiceV3(strNames);
		
	}
}
