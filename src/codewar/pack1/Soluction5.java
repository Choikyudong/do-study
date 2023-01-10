package codewar.pack1;

/**
 * Question : Transportation on vacation
 * Writer : Kyudong
 * Date : 2022-09-09
 * Time : 오후 11:39
 */
public class Soluction5 {

	public static void main(String[] args) {
		System.out.println(Soluction5.rentalCarCost(2)); // 80
		System.out.println(Soluction5.rentalCarCost(6)); // 220
		System.out.println(Soluction5.rentalCarCost(8)); // 270
	}

	private static final int COST_PER_DAY = 40;

	/**
	 * 날짜 조건에 따라 계산된 가격을 반환한다.
	 *
	 * 조건
	 * 1. 매일 $40달러씩 지불해야한다.
	 * 2. 7일을 넘길 경우 총값에 $50달러를 추가로 계산한다.
	 * 3. 3일을 넘길 경우 매일 $20달러로 계산한다.
	 * 
	 * 예시) 6일을 빌렸을 경우
	 * 40 + 40 + 40 + 40 + 40 + 20
	 * 
	 * @param d 차를 빌린 일수
	 * @return 지불해야할 가격
	 * @throws IllegalArgumentException 음수값이 들어올 경우 발생시킨다.
	 */
	public static int rentalCarCost(int d) {
		if (0 > d) {
			throw new IllegalArgumentException();
		}

		int price = d * COST_PER_DAY;

		if (d >= 7) {
			return price - 50;
		} else if (d >= 3) {
			return price - 20;
		}

		return price;
	}

}
