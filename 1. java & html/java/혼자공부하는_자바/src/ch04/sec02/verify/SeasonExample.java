/*
		 연습문제 3. 다중 if ~ else if 또는 switch 이해하고 있을까요 ?
  		1) 오늘 날짜를 얻어서  현재 월을 구하시오.
   		2) 현재 월이 
           	3월, 4월, 5월인 경우   현재 월 + "은 봄입니다." 
           	6월, 7월, 8월인 경우   현재 월 + "은 여름입니다." 
           	9월, 10월, 11월인 경우 현재 월 + "은 가을입니다."
           	12월, 1월, 2월인 경우  현재 월 + "은 겨울입니다."
           	출력하세요
   		3) 현재 날짜는 LocalDateTime클래스를 참조하세요.
          	import java.util.LocalDateTime;
          	...
       	  	현재 날짜는 다음으로 
          	LocalDateTime now = LocalDateTime.now();  
         	현재월은 다음 메소드로 구합니다.
           int month = now.getMonthValue(); 
*/
package ch04.sec02.verify;

import java.time.LocalDateTime;

public class SeasonExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		int month = now.getMonthValue();
		
		if((month >= 3) && (month < 6)) {
			System.out.println("현재 " + month + "월은 봄입니다.");
		}else if((month >= 6) && (month < 9)) {
			System.out.println("현재 " + month + "월은 여름입니다.");
		}else if((month >= 9) && (month < 12)) {
			System.out.println("현재 " + month + "월은 가을입니다.");
		}else {
			System.out.println("현재 " + month + "월은 겨울입니다.");
		}
	}
}
