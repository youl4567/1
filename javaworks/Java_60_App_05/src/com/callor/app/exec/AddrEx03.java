package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx03 {

	public static void main(String[] args) {
		
		AddressVO[] adVO = new AddressVO[3];
		
		
		adVO[0] = AddressVO.builder()
							.name("홍길동")
							.tel("010-111-1111")
							.addr("서울특별시")
							.build();
		
		adVO[1] = AddressVO.builder()
							.name("이몽룡")
							.tel("010-113-1111")
							.addr("광주광역시")
							.build();
		adVO[2] = AddressVO.builder()
							.name("성춘향")
							.tel("010-111-1111")
							.addr("전남")
							.build();
		
		
		AddrServiceV1 printList = new AddrServiceV1();
		printList.printAddrList(adVO);
		
		
	}
	
}
