package com.me.dao;

import java.sql.SQLException;

import com.me.common.DBConnPool;
import com.me.dto.MemberDto;

public class MemberDao extends DBConnPool {
	
	public int regMember(MemberDto dto) {
		int res = 0;
		// 쿼리문장엔 ;를 입력하지 않는다.
		String sql = "INSERT INTO MEMBER (ID, PASS, NAME, REGIDATE, EMAIL)\r\n"
				+ "            VALUES (?, ?, ?, SYSDATE, ?)";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPass());
				pstmt.setString(3, dto.getName());
				pstmt.setString(4, dto.getEmail());
				
				res = pstmt.executeUpdate();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		return res;
	}
	
	public MemberDto login(String id, String pass) {
		MemberDto memberDto = new MemberDto();
		String sql = "SELECT * \r\n" 
				+ "FROM MEMBER\r\n" 
				+ "WHERE ID=? AND PASS=?";

		try {
			// 입력받은 사용자 정보를 DB로부터 조회
			pstmt = con.prepareStatement(sql);
			// 파라메터 세팅
			pstmt.setString(1, id); // 첫 ?에 id값 대입
			pstmt.setString(2, pass); // 두번째 ?에 pass값 대입

			// 쿼리 실행
			rs = pstmt.executeQuery();

			if (rs.next()) {
				// 로그인 성공
				memberDto.setId(rs.getString(1));
				memberDto.setName(rs.getString(2));
				memberDto.setRegidate(rs.getString(4));
				// 사용자 정보를 memberDto에 담아서 반환
				return memberDto;
			} else {
				// 로그인 실패
				return null;
				

			}
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
		// 사용자 정보를 MemberDto 객체에 담아서 반환
	
	}
}
