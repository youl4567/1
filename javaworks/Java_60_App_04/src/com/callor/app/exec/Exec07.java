package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {

	public static void main(String[] args) {
		
		System.out.println(Line.dLilne);
		System.out.println("7 단 구구단");
		System.out.println(Line.sLilne);
		for(int i = 2 ; i < 10 ; i++) {
			System.out.printf("7 X %d =  %d\n", i, 7 * i);
		}
		System.out.println(Line.dLilne);
		
	
	}
}
