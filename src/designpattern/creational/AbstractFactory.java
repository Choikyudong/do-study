package designpattern.creational;

public class AbstractFactory {

	public static void main(String[] args) {
		// client
		Factory factory = new SnackFactoryAline();
		SnackPartA snackPartAA = factory.makeSnackPartA();
		SnackPartB snackPartAB = factory.makeSnackPartB();

		factory = new SnackFactoryBline();
		SnackPartB snackPartBB = factory.makeSnackPartB();
		SnackPartA snackPartBA = factory.makeSnackPartA();
	}

}

// 추상 제품 A
interface SnackPartA {}

// 구현 제품 A1, A2
class PotatoSnack implements SnackPartA {}
class ChocolateSnack implements SnackPartA {}

// 추상 제품 B
interface SnackPartB {}

// 구현 제품 B1, B2
class RiceSnack implements SnackPartB {}
class MeatSnack implements SnackPartB {}

// 추상 팩토리
interface Factory {
	SnackPartA makeSnackPartA();
	SnackPartB makeSnackPartB();
}

// 구현팩토리A
class SnackFactoryAline implements Factory {
	@Override
	public SnackPartA makeSnackPartA() {
		return new PotatoSnack();
	}

	@Override
	public SnackPartB makeSnackPartB() {
		return new MeatSnack();
	}
}

// 구현팩토리B
class SnackFactoryBline implements Factory {
	@Override
	public SnackPartA makeSnackPartA() {
		return new ChocolateSnack();
	}

	@Override
	public SnackPartB makeSnackPartB() {
		return new RiceSnack();
	}
}