package ch07.extra.exam01;

public class JavaProgramming extends Programming{
	//현재 자바프로그래밍이 가능한 기능 출력
	void toDoEnalbe(){
		this.입력기능();
		this.출력기능();
		this.연산기능();
		
		//부모클래스에서 private접근제한이므로
		//자식클래스에서 사용불가
		this.제어기능();
		this.반복기능();
	}
	
	//부모클래스에서 상송받을 수 없는 제어기능과
	//반복기능을 새로 추가
	void 제어기능() {
		System.out.println("새로 만든 제어기능() - 상속불가기능이므로 JavaProgramming클래스에서 새로 만듦");
		System.out.println("조건을 비교하여 선택 실행합니다.");
	}
	
	private void 반복기능() {
		System.out.println("새로 만든 반복기능() - 상속불가기능이므로 JavaProgramming클래스에서 새로 만듦");
		System.out.println("정해진 수만큼 반복합니다.");
	}
}
