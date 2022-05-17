package com.callor.app.exec;

import com.callor.app.model.AddressVO;

/*
 * addressVO 클래스를 사용하여
 * hong, lee, sung 변수명으로 3개의 객체 인스턴스를 생성하고
 * 각각의 객체에 이름, 주소, 전화번호, 나이, 취미를 저장
 * 각 객체에 저장된 이름, 주소, 전화번호, 나이, 취미를 콘솔에 출력
 */
public class AddrEx01 {
	public static void main(String[] args) {
		
		AddressVO hong = new AddressVO();
		hong.setName("홍길동");
		hong.setAddr("한국");
		hong.setTel("010-1111-1111");
		hong.setAge(22);
		hong.setHabby("축구");
		
		AddressVO lee = new AddressVO();
		AddressVO sung = new AddressVO();
		
		System.out.println(hong.toString());
	
	
	}
}
