package com.me.dto;

public class PageDto {
	// 페이지 블럭을 그리기 위해 필요한 정보
	int startNo;		// 페이지 블럭 시작번호
	int endNo;			// 페이지 블럭 끝번호
	int realEndno;		// 게시물의 끝 페이지 번호 (총 게시물의 수 / 페이지당 게시물 수) 
	boolean prev, next;	// 이전, 다음 버튼(true: 보여주기)
	// 위의 정보들을 세팅하기 위해 필요한 값
	int totalCnt;		// 총 게시물의 수
	Criteria cri;		// 요청 페이지번호, 페이지당 게수물 수
	int blockAmount = 10;	// 페이지블럭에 보여줄 페이지의 수
	
	/**
	 * 생성자를 통해 페이지 블럭을 그리기 위한 정보를 세팅한다.
	 * @param totalCnt
	 * @param cri
	 * @param blockAmount
	 */
	public PageDto(int totalCnt, Criteria cri, String blockAmount) {
		// 생성자 호출
		this(totalCnt, cri);

		if(blockAmount != null && !"".equals(blockAmount)) {
			this.blockAmount = Integer.parseInt(blockAmount);			
		}
	}
	
	public PageDto(int totalCnt, Criteria cri) {
		super();
		this.totalCnt = totalCnt;
		this.cri = cri;

		// 요청 페이지, 블럭당 페이지 수에 따라서 블럭의 범위가 정해진다.

		// 페이지 블럭의 시작번호, 끝번호
		endNo = (int)Math.ceil(cri.getPageNo() / (blockAmount * 1.0)) * blockAmount;
		startNo = endNo - (blockAmount - 1);
		
		System.out.println("시작번호 : " + startNo);
		
		// 페이지 끝번호
		realEndno = (int)Math.ceil((totalCnt * 1.0)/cri.getAmount());
		
		// 게시물이 67건인 경우 realEndNo는 7인데 endNo는 10으로 계산된다. 
		// 이 떄 페이지블럭을 더 만들지 않기 위해 비교연산하여 realEndNo를 끝번호로 정한다.
		endNo = endNo > realEndno ? realEndno : endNo;
		
		System.out.println("끝번호 : " + endNo);
		
		prev = startNo == 1 ? false : true;
		next = endNo == realEndno ? false : true;
		

	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}

	public int getRealEndno() {
		return realEndno;
	}

	public void setRealEndno(int realEndno) {
		this.realEndno = realEndno;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}
}