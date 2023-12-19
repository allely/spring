package com.me;

import java.sql.SQLException;

import com.me.common.DBConnection;
/**
 * JDBC 활용한 테스트 데이터 생성
 * board 테이블에 테스트 데이터를 생성.
 */
public class MakeTestData extends DBConnection{
	// DBConnection 이용하는 이유 : main메소드 사용하기 위해
	// DBConnPool : 서버에 의해 생성, 서버를 통해야 실행할 수 있다.
	/**
	 * board 테이블에 데이터를 삽입.
	 */
	public void insert() {
		// 입력 쿼리
		String sql = "INSERT INTO BOARD\r\n"
				+ "VALUES(SEQ_BOARD_NUM.NEXTVAL, '제목'||SEQ_BOARD_NUM.NEXTVAL||'입니다', '내용'||SEQ_BOARD_NUM.NEXTVAL||'입니다', 'test', sysdate, 0)";
		try {
			pstmt = con.prepareStatement(sql);
//			// 파라메터 세팅
//			pstmt.setString(1, sql);
//			pstmt.setString(2, sql);
//			pstmt.setString(3, sql);
//			pstmt.setString(4, sql);
//			pstmt.setString(5, sql);
//			pstmt.setString(6, sql);
			
			// 입력 실행
			int res = pstmt.executeUpdate();
			System.out.println(res +  "건 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 자바 프로그램 실행
	 */
	public static void main(String[] args) {
		MakeTestData d = new MakeTestData();
		for(int i = 0; i < 50; i ++) {
			d.insert();	
		}
		// 자원 반납
		d.close();
	}

}
