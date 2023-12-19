package ch11.sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//보통 매개변수로 데이터를 넘길 때
	//	일반적인 부모클래스(주로 Object) 타입으로 작업을 한다.
	//	그래서 매개변수의 형식을 검사함.
	//	논리합 논리곱 등에서 사용하는 short circut기법

	@Override	// Object 클래스의 equals메소드를 꼭 재정의하라
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			//obj Member타입이므로 실제 세부검사 시행
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		//매가값이 Member타입이 아니거나 id필드값이 다르다면
		return false;
	}
}