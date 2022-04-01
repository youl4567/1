package com.callor.method;

public class Method_02A {

	public static void main(String[] args) {
		
		/*
		 * 명령문 해석
		 * 1. num() 를 실행하여 => num() 를 호출하여 실행하고
		 * 2. 
		 */
		int intNum1 = num();
		
		double douNum1 = doNum();
		douNum1 = 0.0;
		
		long longNum1 = longNum();
		longNum1 = 0;
		
		float fNum1 = fNum();
		fNum1 = 0;
		
		boolean bYes = bYes();
		
		String str = nation();
		
		System.out.println(intNum1);
		System.out.println(longNum1);
		System.out.println(fNum1);
		System.out.println(bYes);
		System.out.println(str);
		
		
	}

	private static String nation() {
		return "대한민국";
	}

	private static boolean bYes() {
		return false;
	}

	private static float fNum() {
		float fNum1 = 0;
		return 0;
	}

	public static long longNum() {
		long longNum1 = 0;
		return 0;
	}

	public static double doNum() {
		double douNum1 = 0;
		return 0;
	}

	public static int num() {
		/*
		 * intNum1 변수는 main() 에서 선언하여 사용하고 있찌만
		 * num() 에서 intNum1 이름으로 변수를 선언하여도 된다.
		 * main() 에서 선언한 intNum1 과 num() 에서 선언된 intNum1은
		 * 부르는 이름만 같고 완전히 다른 변수다.
		 * 
		 * main() 에 선언된 intNum1 변수는 
		 * 		main() 의 지역변수(local var)라고 하고
		 * num() 에 선언된 intNum1 변수는
		 * 		num() 의 지역변수 라고 한다.
		 * 
		 * 지역변수는 서로 다른 영역에서 접근할 수 없다.
		 */
		int intNum1 = 0;
		intNum1 = 300 + 400;
			
		// main() 에서 intNum1 변수의 값을 사용할 수 있도록
		// intNum1 변수의 값을 return 한다.
		return intNum1;
	}
	
}
