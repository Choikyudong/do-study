package codewar.pack1;

/**
 * Question : Is n divisible by x and y?
 * Writer : Kyudong
 * Date : 2022-09-13
 * Time : 오후 10:03
 */
public class Soluction12 {

	public static void main(String[] args) {
		System.out.println(isDivisible(12,4,3));
		System.out.println(isDivisible(3,3,4));
	}

	/**
	 * 2개의 숫자 n이 x와 y값으로 나누어 지는 여부를 반환한다.
	 *
	 * x와 y.는 양의 정수이며, 0은 들어가지 않는다.
	 *
	 * @param n 숫자
	 * @param x 양의 정수
	 * @param y 양의 정수
	 * @return x와 y값으로 나누어지는지 여부
	 */
	public static boolean isDivisible(long n, long x, long y) {
		return (n % x == 0 && n % y == 0);
	}

}
