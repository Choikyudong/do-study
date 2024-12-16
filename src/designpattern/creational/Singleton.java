package designpattern.creational;

import java.io.*;
import java.lang.reflect.Constructor;

public class Singleton {

	public static void main(String[] args) throws Exception {
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

		// 리플렉션을 이용하여 싱글톤 부숴보기
		Constructor<CheckSetting2> constructor = CheckSetting2.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		CheckSetting2 checkSetting3 = constructor.newInstance();
		System.out.println(checkSetting3 == checkSetting2_1);

		// 자바의 직렬화/역직렬화를 통해서도 무효화 가능
		SeriSetting seriSetting1 = SeriSetting.getInstance();
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.obj"))) {
			out.writeObject(seriSetting1);
		}

		SeriSetting seriSetting2;
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("test.obj"))) {
			seriSetting2 = (SeriSetting) in.readObject();
		}
		System.out.println(seriSetting1 == seriSetting2);
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

class SeriSetting implements Serializable {

	private static class SeriSettingHolder {
		private static final SeriSetting INSTANCE = new SeriSetting();
	}

	private SeriSetting() {
	}

	public static SeriSetting getInstance() {
		return SeriSettingHolder.INSTANCE;
	}
	
	// readResolve 메서드는 역직렬화할 떄 재정의할 수 있는 메서드
	// 해당 메서드를 정의하여 싱글톤을 지킬 수 있다.
	@Serial
	protected Object readResolve() {
		return SeriSettingHolder.INSTANCE;
	}

}

// enum을 통해 싱글톤을 정의한다면 리플렉션으로도 생성할 수 없다.
// 자바의 enum은 컴파일 시점에 고정된 값을 가지기 떄문이다.
enum enumSetting {

	INSTANCE;
	
	public void method() {
		// 필요한 메서드를 정의
	}

}
