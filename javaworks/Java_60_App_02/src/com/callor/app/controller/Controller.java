package com.callor.app.controller;

import com.callor.app.impl.ScoreServiceImplV2;
import com.callor.app.service.ScoreService;

public class Controller {

	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV2();
		scService.inputScore();
	}
}
