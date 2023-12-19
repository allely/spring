package com.me.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.me.common.DBConnPool;
import com.me.dto.BoardDto;
import com.me.dto.Criteria;

// DBConnPool 
//		: 톰캣에서 제공하는 기능을 사용하며 커넥션풀이라는 공간에 커넥션 객체를 미리 생성해놓고 사용하는 객체
// 	main에서도 사용이 불가능, 서버가 실행되어야 사용이 가능
//	만약, main 메서드를이용해서 테스트를 하고 싶다면 상속받는 객체를 DBConnection으로 변경해야 한다.
public class BoardDao extends DBConnPool {
//	public int insertBoard(BoardDto dto) {
//		
//	}
	
	public int deleteBoard(String num) {
		String sql = "DELETE\r\n"
				+ "FROM BOARD\r\n"
				+ "WHERE NUM = ?";
		int res = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * 게시글의 조회수를 1 증가시켜줍니다.
	 * insert, update, delete의 반환 타입은 int(몇건이 처리되었는지 반환)
	 * 반환 타입은 int로 설정
	 */
	public int visitcountUp(String num) {
		String sql = "UPDATE BOARD\r\n"
				+ "SET VISITCOUNT = VISITCOUNT+1\r\n"
				+ "WHERE NUM = ?";
		int res = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,num);
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("SQLException 예외사항 발생");
			e.printStackTrace();
		}
		return res;		
	}
	
	/**
	 * 한건의 게시글을 조회 후 반납한다.
	 * @param num
	 * @return BoardDto
	 */
	public BoardDto getOne(String num) {
		BoardDto dto = null;
		String sql = "SELECT * \r\n"
				+ "FROM BOARD \r\n"
				+ "WHERE NUM=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,num);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new BoardDto();
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
			}
			return dto;
		} catch (SQLException e) {
			System.out.println("SQLException 예외사항 발생");
			e.printStackTrace();
		}
		return dto;
	}
	
	/**
	 * 리스트 조회 후 반환
	 *  + 페이징 처리
	 * @return
	 */
	public List<BoardDto> getList(Criteria cri) {
		List<BoardDto> list = new ArrayList<>();
		String where = "";
		try {
			// 검색어와 검색필드에 값이 들어있다면 조건문장을 생성한다.
			if(!"".equals(cri.getSearchField())) {
				where = "WHERE " + cri.getSearchField()
								+ " LIKE '%" + cri.getSearchWord() + "%'";
			}
			System.out.println(where);
			
			String sql = "SELECT *\r\n"
					+ "FROM    (SELECT  ROWNUM RNUM, B.*\r\n"
					+ "        FROM    (SELECT *\r\n"
					+ "                FROM BOARD\r\n"
					+ where
					+ "                ORDER BY NUM DESC\r\n"
					+ "                ) B\r\n"
					+ "        ) \r\n"
					+ "WHERE RNUM BETWEEN ? AND ?";
			pstmt = con.prepareStatement(sql);
			
			//시작번호 = 끝번호 - (페이지당게시물수-1)
			pstmt.setInt(1, cri.getStartNum());
			
			// 끝번호 = 페이지번호 * 페이지당게시물수
			pstmt.setInt(2,  cri.getEndNum());
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDto dto = new BoardDto();
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
				
				list.add(dto);				
			}
			
			
		} catch (SQLException e) {
			System.out.println("SQLException 예외 발생");
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 리스트의 총 건수 조회 후 반환.
	 * - 집계함수를 이용하여 게시글의 총 건수를 구한다.
	 * @return 게시글의 총 건수
	 */
	public int getTotalCnt(Criteria cri) {
		int res = 0;
		String where = "";
		if(!"".equals(cri.getSearchField())) {
			
			where = "WHERE " + cri.getSearchField()
							+ " LIKE '%" + cri.getSearchWord() + "%'";
		}
		String sql = "SELECT COUNT(*) FROM BOARD " + where;
		try {
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				res = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
}