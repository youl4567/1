package com.callor.classes.utils;

public class Line {

	public static String dLine(int length) {
		
		String dLine = "=";
		return dLine.repeat(length);
	}
	
	public static String sLine(int length) {
		String sLine = "-";
		return sLine.repeat(length); 
	}
}
