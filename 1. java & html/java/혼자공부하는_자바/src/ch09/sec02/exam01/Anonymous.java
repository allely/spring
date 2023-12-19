package ch09.sec02.exam01;

public class Anonymous {
	// 필드 초기값으로 익명클래스 사용
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
		// 메소드 변수값으로 익명클래스 사용
	};

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");

				// 로컬클래스의 멤버메소드 호출
				walk();
			}
		};
		// 로컬변수 사용(wake() 호출)
		localVar.wake();
	}
	
	//익명객체를 메소드의 매개변수로 전달하는 경우
	//예) method(익명객체);
	void method2(Person person) {
		//다형성을 이용한 메소드재정의 실행
		person.wake();
	}
	
	//실제 클래스를 이용 구현
	Person student = new Student();
}
