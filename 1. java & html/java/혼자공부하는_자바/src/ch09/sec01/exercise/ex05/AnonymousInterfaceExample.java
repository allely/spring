//exercise03
package ch09.sec01.exercise.ex05;

public class AnonymousInterfaceExample {

	public static void main(String[] args) {
		//화면에 CheckBox위젯을 배치합니다.
		//	지금은 checkBox가 화면에 배치되었다고 가정
		
		CheckBox checkBox = new CheckBox();
		//checkBox객체에 "Select" 이벤트 핸들러 등록
		//OnSelectListener : 이벤트핸들러 이름
		//SetOnSelectListener : 이벤트핸들러 등록함수
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {

			@Override
			public void onSelect() {
				System.out.println("배경을 바꿉니다.");	
			}
		});
			
		//이벤트처리 객체를 만들었으므로 이벤트가 발생하기만을 대기
		//여기서는 select()메소드로 강제로 이벤트 발생
		checkBox.select();
	}
}
