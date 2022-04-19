package com.callor.score.domain;

public class ScoreV2VO /* extends Object */ {

	private String stName;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum; // =0;
	private float fAvg;
	private int KorSum;
	private int EngSum;
	private int MathSum;
	
	

	public String getStName() {
		return stName;
	}

	public int getKorSum() {
		return KorSum;
	}

	public void setKorSum(int korSum) {
		KorSum = intKor;
	}

	public int getEngSum() {
		return EngSum;
	}

	public void setEngSum(int engSum) {
		EngSum = engSum;
	}

	public int getMathSum() {
		return MathSum;
	}

	public void setMathSum(int mathSum) {
		MathSum = mathSum;
	}

	public float getfAvg() {
		fAvg = (float) getIntSum() / 3.0f;
		return fAvg;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}

	@Override
	public String toString() {
		return "ScoreV2VO ["
				+ "stName=" + stName 
				+ ", intKor=" + intKor 
				+ ", intEng=" + intEng 
				+ ", intMath=" + intMath
				+ ", intSum=" + getIntSum() 
				+ ", fAvg=" + getfAvg() + "]";
	}

}
