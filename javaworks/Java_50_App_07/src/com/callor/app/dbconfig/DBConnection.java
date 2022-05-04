package com.callor.app.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection conn;
	static {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "user2";
		String password = "12341234";
		
		// jdk 1.6 �̻󿡼��� ������� �ʾƵ� �ȴ�.
		// 		jdbc �� 4.0 �� ���ԵǾ� �ְ�
		//		jdbc  4.0 �̻󿡼��� ������� �ʾƵ� �ȴ�.
		// String jdbcDriver = "oracle.jdbc.OracleDriver";
		// Class.forNmae(jdbcDriver);
		
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		//end static
	/*
	 * ������Ʈ�� ��ŸƮ�ɶ� conn(DB ����) ��ü�� �ڵ����� �����Ǿ��ְ�
	 * �ʿ��� �� getDBConnection() �޼��带 ���� ������ ����Ѵ�
	 */
	public static Connection getDBConnection() {
		return conn;
	}
	
}
