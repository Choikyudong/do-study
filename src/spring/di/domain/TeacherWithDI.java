package spring.di.domain;


import spring.di.servcie.SmartDevice;

// DI 개념을 적용한 객체
public class TeacherWithDI {

	private final SmartDevice smartDevice;

	// 생성자를 통해 의존성을 주입한다.
	public TeacherWithDI(SmartDevice smartDevice) {
		this.smartDevice = smartDevice;
	}

	public void search(String someThing) {
		smartDevice.search(someThing);
	}

}