package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

/*
 * makeScore()
 * printSocre()
 * sumScore()
 * 등의 method 를 선언하고 임의의 성적을 생성하여 intKor 에 저장
 * 
 * 성적일람표 출력
 * 총점 계산
 */
public class ScoreServiceV5 {

	private int[] intKor;

	public ScoreServiceV5() {
		intKor = new int[100];
	}

	public ScoreServiceV5(int length) {
		intKor = new int[length];
	}

	int intCount = 0;

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 100) + 1;
		}
	}

	int intSumScore = 0;

	public void sumScore() {
		for (int i = 0; i < intKor.length; i++) {
			intSumScore += intKor[i];

		}
	}

	public void printScore() {
		System.out.println(Line.dLine(30));
		System.out.println("국어 성적 일람표");
		System.out.println(Line.sLine(30));
		for (int i = 0; i < intKor.length; i++) {
		System.out.printf("%d : %d\t\t", (i + 1), intKor[i]);
		if ((i + 1) % 5 == 0) {
		System.out.println();
		}
	}
		System.out.println(Line.dLine(30));
		System.out.println("국어 과목 점수 합계 : " + intSumScore);

	}

}
