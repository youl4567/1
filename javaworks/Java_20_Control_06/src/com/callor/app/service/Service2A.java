package com.callor.app.service;

public class Service2A {

	public void print() {
		
		// ServiceV2 와 ServiceV2a 는 
		// 같은 package(c.c.a.service)에 저장된 클래스 이기 때문에
		// import 문이 필요 없다.
		ServiceV2 sV2 = new ServiceV2();
		
		/*
		 * sum() 는 private 으로 설정되어 있기 때문에 호출할 수 없다.
		 * sV2.sum();
		 */
		
		sV2.add();
	}
}
