package com.callor.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.app.dbconfig.DBConnection;
import com.callor.app.model.StudentVO;

public class StudentDao {

	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}
	
	public List<StudentVO> selectAll() throws SQLException {
		
		String sql = "SELECT * FROM tbl_student ";
		PreparedStatement pStr = null;
		
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		
		while(rSet.next() ) {
			// 모든 필드가 매개변수로 제공되는 임의 생성자를 호출하여 VO 만들기
//			StudentVO stVO = new StudentVO(
//					rSet.getString("st_num"),
//					rSet.getString("st_name"),
//					rSet.getString("st_tel"),
//					rSet.getString("st_addr"),
//					rSet.getString("st_dept"),
//					rSet.getInt("st_grade")
//					);
//					
			// 기본생성자를 호출하여 비어있는 vo 를 만들고
			// setter() 메서드를 사용하여 변수에 값 setting 하기
			StudentVO stVO = new StudentVO();
			stVO.setStNum(rSet.getString("stnum"));
			stVO.setStName(rSet.getString("stname"));
			stVO.setStTel(rSet.getString("sttel"));
			stVO.setStAddr(rSet.getString("staddr"));
			stVO.setStDept(rSet.getString("stdept"));
			stVO.setStGrade(rSet.getInt("stgrade"));
			
			StudentVO stVO2 = StudentVO.builder()
								.stNum(rSet.getString("stnum"))
								.stName(rSet.getString("stname"))
								.stTel(rSet.getString("sttel"))
								.build();
					
		}
	}
}
