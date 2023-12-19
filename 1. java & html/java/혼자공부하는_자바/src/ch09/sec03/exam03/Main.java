package ch09.sec03.exam03;

public class Main {
	public static void main(String[] args) {
		Animal dog = new Animal() {
			@Override
			public String bark(){
				return "강아지가 짖습니다.";
			}
			public String run() {
				return "달리기 ㄱㄱ싱";
			}
		};

		//객체 사용
		System.out.println(dog.bark());
		//dog.run();	//dog 안에 있던 메소드. 
						//밖에서 사용할 수 없다.
	}
}