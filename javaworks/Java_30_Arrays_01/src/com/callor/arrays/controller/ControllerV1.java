package com.callor.arrays.controller;

import com.callor.arrays.service.ServiceV1;
import com.callor.arrays.service.ServiceV1A;

public class ControllerV1 {

	public static void main(String[] args) {
		
		ServiceV1 sV1 = new ServiceV1();
		
		int intKorSum = sV1.scoreKorSum();
		
		System.out.println("총점 : " + intKorSum);
		
		ServiceV1A sV1A = new ServiceV1A();
		intKorSum = sV1A.scoreKorSum();
		
		System.out.println("총점 : " + intKorSum);
	}
}
