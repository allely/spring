package com.me.lib.dto;

public class BookDto {

	private String num;
	private String title;
	private String author;
	private String rentyn;
	private String rentynStr;
	
	@Override
	public String toString() {
		return "[ title : " + title + " ]";
	}
	
	public BookDto() {
		
	}
	public BookDto(String num, String title, String author, String rentyn) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.rentyn = rentyn;
		
		rentynStr = rentyn.equals("Y")? "대여중" : "대여가능";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getRentyn() {
		return rentyn;
	}

	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
		rentynStr = rentyn.equals("Y")? "대여중" : "대여가능";
	}

	public String getRentynStr() {
		return rentynStr;
	}

	public void setRentynStr(String rentynStr) {
		this.rentynStr = rentynStr;
	}
}
