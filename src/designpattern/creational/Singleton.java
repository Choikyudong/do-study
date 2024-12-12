package designpattern.creational;

public class Singleton {

	public static void main(String[] args) {
		Setting setting1 = Setting.getInstance();
		Setting setting2 = Setting.getInstance();
		System.out.println(setting1 == setting2);
	}

}

class Setting {

	private static Setting instance;

	private Setting() {
	}

	public static Setting getInstance() {
		if (instance == null) {
			instance = new Setting();
		}
		return instance;
	}

}
