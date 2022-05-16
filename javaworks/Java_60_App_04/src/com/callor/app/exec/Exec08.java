package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
		
		
		String fileName = "src/com/callor/app/exec/data";
		
		// 파일과 관련한 클래스는
		// 객체 선언문과 생성(초기화)를 분리한다
		// try-catch 선언 때문에
		InputStream is = null;
		try {
			is = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(is);
		while(scan.hasNext()) {
			String strLine = scan.nextLine();
			System.out.println(strLine);
		}
		scan.close();
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
}
