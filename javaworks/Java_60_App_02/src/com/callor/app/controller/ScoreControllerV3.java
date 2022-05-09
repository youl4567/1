package com.callor.app.controller;

import com.callor.app.impl.ScoreServiceImplV3;
import com.callor.app.service.ScoreService;

public class ScoreControllerV3 {

	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV3();
		scService.inputScore();
		scService.saveScore();
	}
}
