package com.callor.classes.service;

public class ScoreServiceV3 {
	
	protected String[] students;
	protected int[] intKor;
	
	public ScoreServiceV3() {
		this(10);
	}
	
	public ScoreServiceV3(int length) {
		students = new String[length];
		intKor = new int[length];
	}
	public ScoreServiceV3(String[] students) {
		this.students = students;
		this.intKor = new int[this.students.length];
	}

	/*
	 * 모듈이란?
	 * 모듈화를 통해 분리된 시스템의 기능들로, 서브루틴, 서브시스템, 함수, 메서드 등을 만한다.
	 * 모듈의 결합도
	 * 모듈간에 상호 의존하는 정도 또는 두 모듈 사이의 연관 관계
	 * 모듈의 응집도
	 * 정보 은닉 개념을 확장한 것으로 명령이나 호출문 등 모듈의 내부 요소들의 서로 관련되어 있는 정도
	 * 모듈이 독립적인 기능으로 정의되어 있는 정도를 의미
	 * 잘 설계된 모듈은?
	 * 결합도는 낮고 응집도는 높아야 한다.
	 */
}
