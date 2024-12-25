package designpattern.creational;

public class Builder {

	public static void main(String[] args) {
		// 클라이언트가 원하는대로 속성값을 넣어 객체 생성이 가능하다.
		House house1 = new House.HouseBuilder()
				.setWall(1)
				.setDoor(1)
				.build();
		System.out.println(house1);

		House house2 = new House.HouseBuilder()
				.setDoor(1)
				.build();
		System.out.println(house2);

		House house3 = new House.HouseBuilder()
				.setRoof(2)
				.build();
		System.out.println(house3);

		House house4 = new House.HouseBuilder()
				.build();
		System.out.println(house4);
	}

}

class House {

	// final은 필수 사항이 아님..
	private final int wall;
	private final int door;
	private final int roof;

	// 빌더 패턴을 쓰지 않는다면?..
	/*
	public House(int wall, int door, int roof) {
		this.wall = wall;
		this.door = door;
		this.roof = roof;
	}

	public House(int wall, int door) {
		this.wall = wall;
		this.door = door;
	}
	 */

	private House(HouseBuilder houseBuilder) {
		this.wall = houseBuilder.wall;;
		this.door = houseBuilder.door;;
		this.roof = houseBuilder.roof;;
	}

	public static class HouseBuilder {
		private int wall;
		private int door;
		private int roof;

		public HouseBuilder setWall(int wall) {
			this.wall = wall;
			return this;
		}

		public HouseBuilder setDoor(int door) {
			this.door = door;
			return this;
		}

		public HouseBuilder setRoof(int roof) {
			this.roof = roof;
			return this;
		}

		public House build() {
			return new House(this);
		}
	}

	@Override
	public String toString() {
		return "House{" +
				"wall=" + wall +
				", door=" + door +
				", roof=" + roof +
				'}';
	}
}

