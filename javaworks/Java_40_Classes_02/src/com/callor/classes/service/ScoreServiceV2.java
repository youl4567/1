package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV2 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int linelength;

	public ScoreServiceV2() {
		this(10);
	}

	public ScoreServiceV2(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		linelength = 50;
	}

	public int input() {
		
		System.out.println(Line.dLine(linelength));
		System.out.println("대한 고교 성적처리 V2");;
		System.out.println(Line.sLine(linelength));
		int index = 0;
		while(index < student.length) {
			System.out.println("이름(END:중단) >> ");
			String strName = scan.nextLine();
			if(strName.equals("END")) {
				break;
			}
			int intScore = 0;
			try {
				intScore = Integer.valueOf(strKor)
				student[index] = strName;
				intKor[index] = Integer.valueOf(strKor); 
			System.out.print("점수(정수로, END:중단 >>");
			if(strName.equals("END")) {
				break;
			}
			} catch (Exception e) {
				
			}
			String strKor = scan.nextLine();
			}

	
		}

}
