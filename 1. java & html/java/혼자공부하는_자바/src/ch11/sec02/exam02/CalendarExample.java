package ch11.sec02.exam02;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		//현재 달력을 만들자
		//	Calendar클래스는 추상클래스로 직접 객체를 생성 못함
		//	대신에 스태틱메소드로 getInstance()함수를 이용
		//	운영체제 시간을 얻어옴
		Calendar now = Calendar.getInstance();
		
		//연도 구하기
		int year = now.get(Calendar.YEAR);
		//달 구하기
		int month = now.get(Calendar.MONTH);
		//일 구하기
		int day = now.get(Calendar.DAY_OF_MONTH);
		//요일 구하기(숫자를 리턴하므로) 한글로 표기하려면
		//	switch블럭을 만들어야 함
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY :
			strWeek = "월";
			break;
		case Calendar.TUESDAY :
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY :
			strWeek = "수";
			break;
		case Calendar.THURSDAY :
			strWeek = "목";
			break;
		case Calendar.FRIDAY :
			strWeek = "금";
			break;
		case Calendar.SATURDAY :
			strWeek = "토";
			break;
		case Calendar.SUNDAY :
			strWeek = "";
			break;
		} 	
	}
}