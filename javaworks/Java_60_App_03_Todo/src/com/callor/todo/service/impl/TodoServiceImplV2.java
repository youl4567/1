package com.callor.todo.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.todo.model.TodoVO;

public class TodoServiceImplV2 extends TodoServiceImplV1 {

	public TodoServiceImplV2() {
		super();
		loadTodoList();
	}

	/*
	 * 저장된 todolist.txt 파일을 읽어서 todoList에 추가하기
	 * 
	 * todolist.txt 파일 열기
	 * 			열기할 파일은 V1의 saveFileName 에 저장되어 있다.
	 * 한 라인씩 읽어서
	 * 컴마(,) 기준으로 split 하고
	 * todoVO 에 담고
	 * todoList 에 추가
	 *  	V1 의 todoList 객체가 생성되어 있다.
	 */
	protected void loadTodoList() {
		
		// InputStream 을 생성하고
		InputStream is = null;
		// Scanner 에 연결
		Scanner scan = new Scanner(is);
		
		// saveFileName 으로 가능
		String saveFile = "src/com/callor/todo/model/todolist.txt";

		try {
			is = new FileInputStream(saveFile);
		} catch (FileNotFoundException e) {
			System.out.println(saveFile + "파일을 찾을 수 없습니다.");
			return;
		}
		// key, sdate, stime, edate, etime, content
		int T_KEY = 0;
		int T_SDATE = 1;
		int T_STIME = 2;
		int T_EDATE = 3;
		int T_ETIME = 4;
		int T_CONTENT = 5;
		
		while(scan.hasNext()) {
			// 파일에서 한 라인의 문자열 읽어서 line 변수에 담기
			String line = scan.nextLine();
			
			// 읽어들인 문자열을 콜론(,)을 기준으로 분해하기
			// 분해된 문자열들을 String(문자열)형 배열로 만들고 저장하기
			String[] todo = line.split(",");
			// text 파일에 데이터를 저장하면 마지막에 공백의 라인이 추가되는 경우가 있다.
			// 이때는 split 으로 분해한 배열의 개수가 부족하게 된다.
			// 이러한 상황을 방지하기 위하여 아래 코드를 추가한다.
			if(todo.length < T_CONTENT) continue;
			
			// 분해된 문자열이 담긴 배열에서 각 요소 값을 읽어 변수에 담기
			/*
			 * TodoVO tdVO = new TodoVO();
			 * tdVO.setTKey(todo[0]); tdVO.setSdate(todo[1]);
			 * tdVO.setStime(todo[2]); tdVO.setEdate(todo[3]); tdVO.setEtime(todo[4]);
			 * tdVO.setTContent(todo[5]);
			 */
			
			String eDate = todo[T_EDATE];
			String eTime = todo[T_ETIME];
			
			if(eDate.equalsIgnoreCase("null")) eDate = null;
			if(eTime.equalsIgnoreCase("null")) eTime = null;
			
			TodoVO tdVO = TodoVO.builder()
					.tKey(todo[0])
					.sdate(todo[1])
					.stime(todo[2])
					.edate(eDate)
					.etime(eTime)
					.tContent(todo[5])
					.build();

			todoList.add(tdVO);
			// 각 변수에 담긴 학생정보의 요소들을 VO 객체에 담기
			// VO 클래스의 필드생성자를 사용하여 값이 담긴 stVO 생성
			
			// VO 객체에 담긴 학생의 정보를 list 에 추가
			
		} // end while
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
