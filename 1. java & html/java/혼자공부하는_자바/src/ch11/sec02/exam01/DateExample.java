package ch11.sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		//현재시간 날짜 객체 생성
		Date date = new Date();		//java.util.Date클래스가 필요
		String strNow1 = date.toString();
		System.out.println(strNow1);
		
		//날짜를 한국식으로 표현
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strNow2 = sdf.format(date);
		System.out.println(strNow2);
	}
}
