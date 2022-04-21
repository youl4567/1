package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 {

	private ScoreV2VO[] scores;
	
	public ScoreServiceV2() {
		this(10);
	}
	
	public ScoreServiceV2(int length) {
		
		scores = new ScoreV2VO[length];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreV2VO();
		}
	}
	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV2(String[] stNames) {
		
		int length = stNames.length;
	}
	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 V1");
		System.out.println(Line.sLine(50));
		System.out.println("이   름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int Sum = 0;
		float AvgSum = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%3s", scores[i].getStName());
			System.out.printf("%4d\t", scores[i].getIntKor());
			System.out.printf("%4d\t", scores[i].getIntEng());
			System.out.printf("%4d\t", scores[i].getIntMath());
			System.out.printf("%6d\t", scores[i].getIntSum());
			System.out.printf("%4.2f\n", scores[i].getfAvg());
				intKorSum += scores[i].getIntKor();
				intEngSum += scores[i].getIntEng();
				intMathSum += scores[i].getIntMath();
				Sum += scores[i].getIntSum();
				/*
				 * 평균 계산 주의
				 * avgResult += scores[i].getfAvg();
				 */
				AvgSum += scores[i].getfAvg() / scores.length;
		}
		System.out.println(Line.sLine(50));
		// System.out.printf("총점\t%d\t%d\t%d\t%d\t%f",intKorSum, intEngSum, intMathSum, Sum, AvgSum);
		System.out.printf("%3s\t","총점");
		System.out.printf("%4d\t", intKorSum);
		System.out.printf("%4d\t", intEngSum);
		System.out.printf("%4d\t", intMathSum);
		System.out.printf("%6d\t", Sum);
		System.out.printf("%4.2f\n", AvgSum);
		}
		
	}
