package com.callor.app.dbconfig;

public class DBContract {
	public static final String ST_SELECT = 
			"SELECT * FROM tbl_student ORDER BY stnum";
	
	public static class ST_COL {
		public static final String ST_NUM = "STNUM";
		public static final String ST_NAME = "STNAME";
		public static final String ST_DEPT= "STDEPT";
		public static final String ST_GRADE = "STGRADE";
		public static final String ST_TEL = "STTEL";
		public static final String ST_ADDR = "STADDR";
		
	}

}
