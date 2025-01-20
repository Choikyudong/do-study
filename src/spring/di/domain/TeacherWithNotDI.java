package spring.di.domain;

import spring.di.servcie.SmartDevice;
import spring.di.servcie.SmartPhone;

// DI 개념을 적용하지 않은 객체
public class TeacherWithNotDI {

	// 직접 의존한다.
	private final SmartDevice smartDevice = new SmartPhone();

	public void search(String someThing) {
		smartDevice.search(someThing);
	}

}
