package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx04 {
public static void main(String[] args) {
	/*
	 * List : interface, 데이터 그룹을 저장하기 위한 type
	 * 		Collections type
	 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터 타입
	 * List 를 선언할 때는 Generic type 을 지정한다
	 * 		1. List 에 add 하는 데이터를 제한하여
	 * 		잘못된 데이터가 add 되는 것을 방지하기 위함
	 *		2. 메모리 낭비를 막고 성능상 이점이 있기 때문에
	 * 아래 선언된 List 는 Generic type 이 AddressVO 이다
	 * 여기 List 에 데이터를 추가하려면 먼저 AddressVO 타입의
	 * 		vo 객체를 만들고, 데이터를 저장한 다음 add 한다.
	 */
	List<AddressVO> addrList = new ArrayList<AddressVO>();
	
	AddressVO hong = AddressVO.builder()
			.name("홍길동")
			.tel("010-111-1111")
			.addr("서울특별시")
			.build();
			addrList.add(hong);
	AddressVO lee = AddressVO.builder()
			.name("이몽룡")
			.tel("010-113-1111")
			.addr("광주광역시")
			.build();
			addrList.add(lee);
	AddressVO sung = AddressVO.builder()
			.name("성춘향")
			.tel("010-111-1111")
			.addr("전남")
			.build();
			addrList.add(sung);
			
	AddrServiceV1 adservice = new AddrServiceV1();
	adservice.printAddrList(addrList);
}

}
