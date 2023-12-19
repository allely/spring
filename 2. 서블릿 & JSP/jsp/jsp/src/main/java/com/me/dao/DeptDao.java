package com.me.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import com.me.common.DBConnection;
import com.me.dto.DeptDto;
/**
 * DAO : DB로부터 데이터의 CRUD작업을 처리하는 객체
 */
public class DeptDao extends DBConnection{
	
	// 생성자를 통해서 Connection객체를 생성 후 멤버변수 con에 저장
	public DeptDao(ServletContext application) {
		// application으로부터 데이터베이스 접속 정보를 꺼내온다.
		super(application);
	}
	
	public List<DeptDto> getList() {
		List<DeptDto> list = new ArrayList<>();
		String sql = "SELECT *\r\n"
				+ "FROM DEPARTMENT D, LOCATION L\r\n"
				+ "WHERE D.LOCATION_ID = L.LOCAL_CODE";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				DeptDto dto = new DeptDto();
				dto.setDept_id(rs.getString("dept_id"));
				dto.setDept_title(rs.getString("dept_title"));
				dto.setLocation_id(rs.getString("location_id"));
				dto.setLocal_code(rs.getString("local_code"));
				dto.setNational_code(rs.getString("national_code"));
				dto.setLocal_name(rs.getString("local_name"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("SQLException 예외 발생");
			e.printStackTrace();
		}
		return list;
	}

}