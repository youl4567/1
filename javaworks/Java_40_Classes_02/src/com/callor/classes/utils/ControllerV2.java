package com.callor.classes.utils;

import com.callor.classes.service.ScoreServiceV2;

public class ControllerV2 {
	public static void main(String[] args) {
		
		ScoreServiceV2 sV2 = new ScoreServiceV2(3);
		int intResult = sV2.input();
		if(intResult < 0) {
			System.out.println("입력 도중 중단함");
		} else {
			System.out.println("입력을 모두 마침");
		}
	}
}
