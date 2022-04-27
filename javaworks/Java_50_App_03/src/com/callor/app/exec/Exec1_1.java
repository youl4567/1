package com.callor.app.exec;

public class Exec1_1 {

	public static void main(String[] args) {
		
		int[] intNums = new int[10];
		for(int i = 0; i <intNums.length ; i++) {
			int num = (int)(Math.random() * 100) + 1;
			intNums[i] = num;
		}
		for(int i = 0 ; i <intNums.length; i++) {
			System.out.println(intNums[i]);
		}
	}
}
