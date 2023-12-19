package com.me.utils;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

public class JSFunction {
	/**
	 * 알림창을 띄우고 URL로 이동한다.
	 * @param msg
	 * @param out
	 */
	public static void alertBack(String msg, JspWriter out) {
		
		// 삽입할 자바스크립트 코드를 완성
		String script=""
				 	+ "	<script type='text/javascript'>"
				 	+ "		alert('" + msg + "');"
				 	+ "		history.go(-1);"
				 	+ "	</script>";
				 		

		try {
			// out객체를 활용하여 스크립트를 화면에 출력한다.
			out.print(script);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
public static void alertBack(String msg, String url, JspWriter out) {
		
		// 삽입할 자바스크립트 코드를 완성
		String script=""
				 	+ "	<script type='text/javascript'>"
				 	+ "		alert('" + msg + "');"
				 	+ "		location.href=' " + url + "';"
				 	+ "	</script>";
				 		

		try {
			// out객체를 활용하여 스크립트를 화면에 출력한다.
			out.print(script);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}