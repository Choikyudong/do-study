package spring.di.servcie;

public class SmartPhone implements SmartDevice {

	@Override
	public void search(String someThing) {
		System.out.println("Search By SmartPhone : " + someThing);
	}

}
