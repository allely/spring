package com.me;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionJob {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "USER01";
		String pw = "1234";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 커넥션
			con = DriverManager.getConnection(url, id, pw);
			
			// 쿼리 문장
			String sql = "select * from job";
			
			// 쿼리 문장 실행
			stmt = con.createStatement();
			
			rs=stmt.executeQuery(sql);
			
			// rs.next()가 null이 나올 때까지 
			while(rs.next()) {
				System.out.print(rs.getString(1) + " ");
				System.out.println(rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("connection 객체 생성 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				System.out.println("자원 해제 중 예외상황 발생");
				e.printStackTrace();
			}
		}
	}
}