package com.me;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionEmp {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "USER01";
		String pw = "1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		/*
		 * 1. 드라이버 로딩
		 * 		DB에 접근하기 위해 필요한 라이브러리가 있는지 확인
		 * 2. 커넥션 객체를 생성
		 */
		
		int empId = 210;
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("오라클드라이버 확인");
			// 2. 커넥션 성공
			con = DriverManager.getConnection(url, id, pw);
			
			// 3. 쿼리문장 준비
			String sql = "SELECT EMP_ID, EMP_NAME, EMP_NO "
					+ "FROM EMPLOYEE WHERE "
					+ "EMP_ID > " + empId;
			
			// 4. 쿼리 문장 실행
			stmt = con.createStatement();
			// stmt.executeQuery(sql)
			//	select문장을 실행할 경우 ResultSet을 반환.
			// stmt.executeUpdate(sql)
			//	update, insert, delete 의 경우 int타입 반환.
			//		-> 실행결과 몇 건이 처리되었는지
			rs = stmt.executeQuery(sql);
			
			
			// 한 열씩 받아옴.
			// 더이상 rs.next가 나오지 않을 때까지
			while(rs.next()) {
				// 숫자를 입력 시 1부터
				// 숫자 또는 결과집합의 칼럼명
				System.out.print(rs.getString("EMP_ID") + " ");
				// error -> 스트링타입 입력 시 이름으로 찾으므로 오류 발생
				// System.out.println(rs.getString("1"));
				System.out.print(rs.getString("EMP_NAME") + " ");
				System.out.println(rs.getString("EMP_NO"));
				
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 - 라이브러리를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection 객체 생성 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch(Exception e) {
				System.out.println("자원 해제 중 예외사항이 발생하였습니다.");
				e.printStackTrace();
			}
			
		}
	}
}