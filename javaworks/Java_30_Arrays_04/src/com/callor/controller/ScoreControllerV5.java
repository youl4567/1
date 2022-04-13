package com.callor.controller;

import com.callor.arrays.service.ScoreServiceV5;

public class ScoreControllerV5 {

	public static void main(String[] args) {
		
		ScoreServiceV5 sV5 = new ScoreServiceV5();
		
		sV5.makeScore();
		sV5.sumScore();
		
		sV5.printScore();
	}
}




