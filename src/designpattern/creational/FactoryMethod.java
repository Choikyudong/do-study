package designpattern.creational;

public class FactoryMethod {

	public static void main(String[] args) {
		Car car1 = new RedCarFactory().validAndMake("사람1", "빨강", "구형1");
		Car car2 = new BlueCarFactory().validAndMake("사람2", "빠랑", "구형1");
	}
}

// 크리에이터 역할로 공통적인 서비스 로직을 넣는건 선택사항
interface CarFactory {

	default Car validAndMake(String ownerName, String color, String modelNum) {
		if (!validate(ownerName, color, modelNum)) {
			System.out.println("기재된 내용을 다시 확인해주세요");
			return null;
		}
		return makeCar(ownerName, color, modelNum);
	}

	default boolean validate(String ownerName, String color, String modelNum) {
		boolean isPass = true;
		if (ownerName.isEmpty()) {
			System.out.println("이름 입력 필요");
			isPass = false;
		}

		if (color.isEmpty()) {
			System.out.println("색상 입력 필요");
			isPass = false;
		}

		if (modelNum.isEmpty()) {
			System.out.println("모델 선택 필요");
			isPass = false;
		}

		return isPass;
	}

	Car makeCar(String owerName, String color, String modelNum);

}

class RedCarFactory implements CarFactory {
	@Override
	public Car makeCar(String owerName, String color, String modelNum) {
		System.out.println("RedCar 생성완료");
		Car car = new RedCar();
		car.setOnwerName(toString());
		if (!color.equals("빨강")) { // 추가로 서비스 로직을 넣어도 된다.
			return null;
		}
		car.setColor(color);
		car.setModelNum(modelNum);
		return car;
	}
}

class BlueCarFactory implements CarFactory {
	@Override
	public Car makeCar(String owerName, String color, String modelNum) {
		System.out.println("BlueCar 생성완료");
		Car car = new BlueCar();
		car.setOnwerName(toString());
		car.setColor(color);
		car.setModelNum(modelNum);
		return car;
	}
}

interface Car {

	void setOnwerName(String owerName);
	String getOnwerName();

	void setColor(String color);
	String getColor();

	void setModelNum(String modelNum);
	String getModelNum();

}

class RedCar implements Car {

	private String owerName;
	private String color;
	private String modelNum;

	@Override
	public String getOnwerName() {
		return this.owerName;
	}

	@Override
	public void setOnwerName(String owerName) {
		this.owerName = owerName;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getModelNum() {
		return modelNum;
	}

	@Override
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
}

class BlueCar implements Car {

	private String owerName;
	private String color;
	private String modelNum;

	@Override
	public String getOnwerName() {
		return this.owerName;
	}

	@Override
	public void setOnwerName(String owerName) {
		this.owerName = owerName;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getModelNum() {
		return modelNum;
	}

	@Override
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
}

