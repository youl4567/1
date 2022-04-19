package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV2;

public class StudentControllerV2 {
	
	public static void main(String[] args) {
		
		StudentServiceV2 stService2 = new StudentServiceV2(5);
		stService2.inputStudent();
		stService2.printStudent();		
	}

}
