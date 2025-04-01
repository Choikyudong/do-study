package designpattern.structural;

public class Adapter {

	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5d);
		RoundPeg roundPeg = new RoundPeg(5d);
		if (hole.fits(roundPeg)) {
			System.out.println("fits");
		}

		SquarePeg smallS = new SquarePeg(2d);
		SquarePeg largeS = new SquarePeg(20d);

		SquarePegAdapter smallAdapter = new SquarePegAdapter(smallS);
		SquarePegAdapter largeAdapter = new SquarePegAdapter(largeS);
		if (hole.fits(smallAdapter)) {
			System.out.println("small fits");
		}
		if (hole.fits(largeAdapter)) {
			System.out.println("large fits");
		}
	}

}

class RoundHole {
	private double radius;

	public RoundHole(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public boolean fits(RoundPeg peg) {
		return this.getRadius() >= peg.getRadius();
	}
}

class RoundPeg {
	private double radius;

	public RoundPeg() {}

	public RoundPeg(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
}

class SquarePeg {
	private double width;

	public SquarePeg(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double getSquare() {
		return Math.pow(this.width, 2);
	}
}

class SquarePegAdapter extends RoundPeg {
	private SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg) {
		this.peg = peg;
	}

	@Override
	public double getRadius() {
		return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
	}
}

