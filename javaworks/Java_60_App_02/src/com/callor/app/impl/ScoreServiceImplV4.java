package com.callor.app.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV4 extends ScoreServiceImplV3 {

	public ScoreServiceImplV4() {
		super();
	}

	@Override
	public void saveScore() {

		FileWriter filerWriter = null;
		PrintWriter print = null;
		
		try {
			filerWriter = new FileWriter(saveFileName);
			print = new PrintWriter(filerWriter);
			for(ScoreVO scVO : scList) {
				String writeStr = "";
				writeStr += String.format("%s:", scVO.getStName());
				writeStr += String.format("%d:", scVO.getIntKor());
				writeStr += String.format("%d:", scVO.getIntEng());
				writeStr += String.format("%d\n", scVO.getIntMath());
			} //end for
			print.close();
			filerWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
