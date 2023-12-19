package com.me.el;

public class MyElClass {
	public String gender = "str";
	
	/**
	 * 주민번호를 입력받아서 성별을 반환
	 * @param jumin
	 * @return 성별(남/여)
	 */
	public String getGender(String jumin) {
		String gender = "";
		// 문자열의 위치 확인 indexOf
		int startIndex = jumin.indexOf("-") + 1 ;
		// subString(시작인덱스-포함, 끝인덱스 - 미포함)
		String str = jumin.substring(startIndex, startIndex+1);
		if ("1".equals(str) 
				|| "3".equals(str)) {
			gender = "남";
		} else if ("2".equals(str) 
				|| "4".equals(str)) {
			gender = "여";
		} else {
			gender = "주민등록번호를 확인해주세요.";
		}
				
		return gender;
	}
	public static void main(String[] args) {
		MyElClass myclass = new MyElClass();
		System.out.println(	myclass.getGender("000000-4234567"));
		
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
