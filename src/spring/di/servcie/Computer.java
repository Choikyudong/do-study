package spring.di.servcie;

public class Computer implements SmartDevice {

	@Override
	public void search(String someThing) {
		System.out.println("Search By Computer : " + someThing);
	}

}
