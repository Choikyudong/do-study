package designpattern.creational;

public class Singleton {

	public static void main(String[] args) {
		Setting setting1 = Setting.getInstance();
		Setting setting2 = Setting.getInstance();
		System.out.println(setting1 == setting2);

		SyncSetting syncSetting1 = SyncSetting.getInstance();
		SyncSetting syncSetting2 = SyncSetting.getInstance();
		System.out.println(syncSetting1 == syncSetting2);

		EarlySetting earlySetting1 = EarlySetting.getInstance();
		EarlySetting earlySetting2 = EarlySetting.getInstance();
		System.out.println(earlySetting1 == earlySetting2);

		CheckSetting checkSetting1 = CheckSetting.getInstance();
		CheckSetting checkSetting2 = CheckSetting.getInstance();
		System.out.println(checkSetting1 == checkSetting2);

		CheckSetting2 checkSetting2_1 = CheckSetting2.getInstance();
		CheckSetting2 checkSetting2_2 = CheckSetting2.getInstance();
		System.out.println(checkSetting2_1 == checkSetting2_2);
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

// synchronized를 사용하여 쉽게 가능하지만 성능 문제 가능성이 생김
class SyncSetting {

	private static SyncSetting instance;

	private SyncSetting() {
	}

	public static synchronized SyncSetting getInstance() {
		if (instance == null) {
			instance = new SyncSetting();
		}
		return instance;
	}

}

// 클래스에 이른 초기화하여 사용하는 것도 하나의 방법, 쓰지 않는다면 문제가 생길 가능성이 생김
class EarlySetting {

	private static final EarlySetting INSTANCE = new EarlySetting();

	private EarlySetting() {
	}

	public static synchronized EarlySetting getInstance() {
		return INSTANCE;
	}

}

// Double-checked locking 으로 조금 더 효율적으로 사용이 가능
class CheckSetting {

	// 1.5 버전부터 지원하는 volatile을 사용시 변수의 값이 메인 메모리에 직접 읽고 쓰임
	// 이를 통해 instance의 최신 값을 여러 스데르에서 공유가 가능하다.
	private static volatile CheckSetting instance;

	private CheckSetting() {
	}

	public static CheckSetting getInstance() {
		if (instance == null) {
			// if문 안에 들어올 상황에만 동기화가 진행되기에 기존 동기화에 비해 성능 향상
			synchronized (CheckSetting.class) {
				if (instance == null) {
					instance = new CheckSetting();
				}
			}
		}
		return instance;
	}

}

// Holder 클래스 방식으로 앞서 더블 체킹 방식보다 보편적으로 사용된다.
class CheckSetting2 {

	// 해당 객체가 사용될 때 내부 클래스에서 사용할 인스턴스를 초기화하여 사용한다.
	private static class CheckSettingHolder {
		private static final CheckSetting2 INSTANCE = new CheckSetting2();
	}

	private CheckSetting2() {
	}

	public static CheckSetting2 getInstance() {
		return CheckSettingHolder.INSTANCE;
	}

}