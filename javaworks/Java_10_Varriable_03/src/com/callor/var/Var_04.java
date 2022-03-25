package com.callor.var;

public class Var_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num1 = 10;
		Num1 = Num1 + 10; // 영문자 17글자(빈칸 ; 포함)
		
		// 용량을 줄이기 위해서
		
		Num1=Num1+10; // 영문자 13글자
		Num1+=10;	//Num1 = Num1 + 10; 과 똑같은 코드
		Num1 += 10;
		
		Num1 +=	1;  // 1 증가 시키기
		Num1 +=	1;
		Num1 +=	1;
		
		Num1 ++;	// 1 증가 시키기
		
		Num1 = Num1 - 10;
		Num1 -= 10;
		
		Num1 = Num1 - 1;
		Num1 -= 1;
		Num1 --;
		
		Num1 *= 3; // Num1 = Num1 * 3;
		// 원래의 Num1 값에 3을 곱해서 다시 Num1에 저장하라
		
		Num1 -= 3; // Num1 = Num1 - 3;
		Num1 /= 3; // Num1 = Num1 / 3;
		Num1 %= 2; // Num1 = Num1 % 2;
		
		
	}

}
