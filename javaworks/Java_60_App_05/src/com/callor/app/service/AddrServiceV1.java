package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;
/*
 * service.AddrServiceV1 클래스를 선언
 * printAddr() method 선언
 * AddrEx02 에서 printAddr(hong) 을 호출하여
 * 주소를 콘솔에 출력
 */
public class AddrServiceV1 {
	
	// AddressVO type 의 매개변수 1개 받기
	public void printAddr(AddressVO hong) {
		System.out.println(hong.getAddr());
		
	}
	// AddressVo 배열 타입의 매개변수 1개받기
	// 배열의 개수만큼 AddressVO 가 전달된다
	public void printAddrList(AddressVO[] vo) {
		for(int i = 0; i< vo.length ; i++) {
			System.out.println(vo[i].toString());
			
		for(AddressVO vo1 : vo) {
			System.out.println(vo1);
			}
		}
	}
	
	public void printAddrList(List<AddressVO> list) {
		int size = list.size();
		for(int i = 0 ; i <size ;i++) {
			System.out.println(list.get(i));
		}
		for(AddressVO vo :list ) {
			System.out.println(vo);
		}
		
	}


	

}