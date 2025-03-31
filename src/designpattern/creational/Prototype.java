package designpattern.creational;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Prototype {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		List<Shape> shapeCopy = new ArrayList<>();

		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);

		Circle copyCircle = (Circle) circle.clone();
		shapes.add(copyCircle);

		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "blue";
		shapes.add(rectangle);

		cloneAndCompare(shapes, shapeCopy);
	}

	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Shapes are different objects (yay!)");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": And they are identical (yay!)");
				} else {
					System.out.println(i + ": But they are not identical (booo!)");
				}
			} else {
				System.out.println(i + ": Shape objects are the same (booo!)");
			}
		}
	}

}

abstract class Shape {
	int x;
	int y;
	String color;

	public Shape() {}

	public Shape(Shape target) {
		if (target != null) {
			this.x = target.x;
			this.y = target.y;
			this.color = target.color;
		}
	}

	// 프토토타입 패턴 핵심 역할
	@Override
	public abstract Shape clone();

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Shape shape = (Shape) o;

		if (x != shape.x) return false;
		if (y != shape.y) return false;
		return Objects.equals(color, shape.color);
	}

	@Override
	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		result = 31 * result + (color != null ? color.hashCode() : 0);
		return result;
	}

}

class Circle extends Shape {
	int radius;

	public Circle() {}

	public Circle(Circle target) {
		super(target);
		if (target != null) {
			this.radius = target.radius;
		}
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Circle circle = (Circle) o;

		return radius == circle.radius;
	}

	@Override
	public int hashCode() {
		return radius;
	}

}

class Rectangle extends Shape {
	int width;
	int height;

	public Rectangle() {}

	public Rectangle(Rectangle target) {
		super(target);
		if (target != null) {
			this.width = target.width;
			this.height = target.height;
		}
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Rectangle rectangle = (Rectangle) o;

		if (width != rectangle.width) return false;
		return height == rectangle.height;
	}

	@Override
	public int hashCode() {
		int result = width;
		result = 31 * result + height;
		return result;
	}
}