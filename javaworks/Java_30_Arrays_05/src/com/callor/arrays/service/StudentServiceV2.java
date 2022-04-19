package com.callor.arrays.service;

import java.util.Scanner;

import com.callor.arrays.utils.Line;

/*
 * ServiceV2 에서 ServiceV1 을 상속 받았다.
 * 상속을 받으면 ServiceV1 에 선언된 변수, 메서드를 그대로 물려받는다.
 * 단, 생성자 제외
 * 
 * 상속 키워드가 extends(확장) 인 것에 주목!!
 */
public class StudentServiceV2 extends StudentServiceV1 {


	
	// 기본 생성자
	public StudentServiceV2() {
		this(10);
	}
	
	// 임의 생성자
	public StudentServiceV2(int length) {
		strStudents = new String[length];
		scan = new Scanner(System.in);
	}

	/*
	 * Override(재 정의)
	 * ServiceV1 에 선언된 메서드 중에서 inputStudent 메서드를 다시 정의하겠다.
	 */
	@Override
	public int inputStudent() {

		System.out.println(Line.dLine(50));
		System.out.println("학생정보 입력 v2");
		System.out.println(Line.sLine(50));
		
		int index = 0;
		for(index = 0; index < strStudents.length ; index++) {
			System.out.printf("%d 번 학생입력(QUIT : 중단) > ", index+1);
			String strName = scan.nextLine();
			if(strName.equals("QUIT")) {
				break;
			}
			strStudents[index] = strName;
		}
		/*
		 * for() 가 시작되기전에 선언된 index는 for() {} 종료되어도 값을 유지하고 잇다.
		 * 
		 * 만약 for() 명령문이 모두 수행되지 않고 중단되면 
		 * index < strStudents.length
		 * 
		 */
		if(index < strStudents.length ) {
			System.out.println("입력이 중단되었습니다.");
		} else {
			System.out.println("입력을 모두 마쳤습니다.");
		}
		
		
		// System.out.println("index : " + index);
		// System.out.println("종료");
		return 0;
	}
	/*
	 * 		생성자 method
	 * 
	 * 1. 클래스를 사용하여 객체(instrance) 선언 후 인스턴스화 할 때 호출하는 method
	 * 2. 생성자 method 는 return type(void, int, String 등)이 없다.
	 * 3. 클래스 이름과 같다.(첫글자 대문자)
	 * 4. 클래스를 선언하면 "기본 생성자"는 자동으로 선언된다.
	 * 5. "임의 생성자"를 선언하면 기본 생성자를 선언해주어야 한다.
	 * 생성자에서는 인스턴스변수(클래스 영역의 변수)를 초기화 하는 코드가 포함된다. 
	 */
	

	
	
}







