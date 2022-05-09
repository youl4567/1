package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScoreVO {

	private String stName;
	private int intKor;
	private int intEng;
	private int intMath;
	
	// 필드변수와 관계없이 총점을 계산하여 리턴하는 메서드 정의하기
	// 객체지향에서 이러한 별개의 메서드를 메시지라고 한다.
	// 또는 객체의 행위라고 한다.
	// vo.getIntSum() 메서드를 호출하면 3과목의 합계점수를 리턴한다.
	public int getIntSum() {
		int sum = intKor + intEng + intMath;
		return sum;
	}
	
	// vo.getAvg() 메서드를 호출하면 3과목의 평균을 계산하여 리턴한다.
	public float getAvg() {
		int sum = getIntSum();
		float avg = (float)sum / 3;
		return avg;
	}
	/*
	 * toString() 메서드를 재정의하여
	 * 한 학생의 성적리스트를 문자열로 리턴하겠다.
	 */
	public String toString() {
	
		String result = "";
		// 전체 10자리의 공간을 만들고 이름위치를 확보
		result += String.format("%-10s\t", stName);
		result += String.format("%5d\t", intKor);
		result += String.format("%5d\t", intEng);
		result += String.format("%5d\t", intMath);
		
		result += String.format("%5d\t", getIntSum());
		result += String.format("%5.2f\t", getAvg());
		
		return result;
	}
}
