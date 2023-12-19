package ch08.sec01.exam06;

public class Member {
	private String memberId;
	private String memberName;
	private String memberTel;
	
	//외부에서는 이 메소드들을 통해서 데이터필드에 접근가능
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	
	public void printMemberInfo() {
		String info = """
				회원 아이디 : $memberId
				회원 이름   : $memberName
				회원 전화   : $memberTel
				"""
				.replace("$memberId", memberId)
				.replace("$memberName", memberName)
				.replace("$memberTel", memberTel);
	}
}
