package spring.di;

import spring.di.domain.TeacherWithDI;
import spring.di.domain.TeacherWithNotDI;
import spring.di.servcie.Computer;
import spring.di.servcie.SmartPhone;

public class Main {

	public static void main(String[] args) {
		// 컴퓨터를 사용하는 교사
		TeacherWithDI teacherWithComputer = new TeacherWithDI(new Computer());
		teacherWithComputer.search("Google");

		// 스마트폰을 사용하는 교사
		TeacherWithDI teacherWithSmartPhone = new TeacherWithDI(new SmartPhone());
		teacherWithSmartPhone.search("Make a Pizza");

		// DI 개념을 적용하지 않았고 해당 객체는 평생 스마트폰만 이용한다.
		TeacherWithNotDI teacherWithNotDI = new TeacherWithNotDI();
		teacherWithNotDI.search("Only SmartPhone");
	}

}
