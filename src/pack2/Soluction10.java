package pack2;

/**
 * Question : You're a square!
 * Writer : Kyudong
 * Date : 2022-10-06
 * Time : 오후 11:27
 */
public class Soluction10 {

	public static void main(String[] args) {
		System.out.println(isSquare(-1));
		System.out.println(isSquare(0));
		System.out.println(isSquare(3));
		System.out.println(isSquare(4));
		System.out.println(isSquare(25));
		System.out.println(isSquare(26));
	}

	/**
	 * 주어진 숫자로 정사가각형을 만들 수 있는지 판단한다.
	 *
	 * @param n 숫자
	 * @return 가능할 경우 true, 그렇지않다면 false
	 */
//	public static boolean isSquare(int n) {
//		return n == 0 || n % Math.sqrt(n) == 0;
//	}

	/**
	 * 위의 식의 단점이 0을 따로 뺀다는 거였는데 아래 식으로 한다면 그런 걱정이 없다.
	 * 
	 * 수학적인 지식이 부족해서 생긴 문제같음
	 *
	 * @param n 숫자
	 * @return 가능할 경우 true, 그렇지않다면 false
	 */
	public static boolean isSquare(int n) {
		return Math.sqrt(n) % 1 == 0;
	}

}
