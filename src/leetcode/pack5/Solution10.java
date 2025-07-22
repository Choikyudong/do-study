package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/">
 * 문제링크
 * </a>
 */
public class Solution10 {

	public static void main(String[] args) {
		// 테스트1 : [null, true, true, false, false]
		ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
		parkingSystem.addCar(1);
		parkingSystem.addCar(2);
		parkingSystem.addCar(3);
		parkingSystem.addCar(1);
	}

	static class ParkingSystem {

		private int bigParkingLot;
		private int mediumParkingLot;
		private int smallParkingLot;

		public ParkingSystem(int big, int medium, int small) {
			this.bigParkingLot = big;
			this.mediumParkingLot = medium;
			this.smallParkingLot = small;
		}

		public boolean addCar(int carType) {
			return switch (carType) {
				case 1 -> {
					if (bigParkingLot > 0) {
						bigParkingLot--;
						yield true;
					} else {
						yield false;
					}
				}
				case 2 -> {
					if (mediumParkingLot > 0) {
						mediumParkingLot--;
						yield true;
					} else {
						yield false;
					}
				}
				case 3 -> {
					if (smallParkingLot > 0) {
						smallParkingLot--;
						yield true;
					} else {
						yield false;
					}
				}
				default -> false;
			};
		}
	}

}
