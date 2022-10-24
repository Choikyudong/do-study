package pack2;

import java.util.Arrays;

/**
 * Question :
 * Writer : Kyudong
 * Date : 2022-10-24
 * Time : 오후 10:42
 */
public class Soluction29 {

	public static void main(String[] args) {
		System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
		System.out.println(oddOrEven(new int[] {0, 1, 4}));
		System.out.println(oddOrEven(new int[] {0, -1, -5}));
		System.out.println(oddOrEven(new int[] {0}));
	}

	/**
	 * 배열의 합이 홀수일 경우 odd 짝수일 경우 even을 반환한다.
	 *
	 * 배열의 값이 비어있을 경우 0으로 취급한다.
	 *
	 * @param array int[]
	 * @return even 또는 odd
	 */
//	public static String oddOrEven (int[] array) {
//		int result = 0;
//		for (var i : array)
//			result += i;
//		return result % 2 == 0 ? "even" : "odd";
//	}

	/**
	 * 배열의 합이 홀수일 경우 odd 짝수일 경우 even을 반환한다.
	 *
	 * 배열의 값이 비어있을 경우 0으로 취급한다.
	 *
	 * @param array int[]
	 * @return even 또는 odd
	 */
	public static String oddOrEven (int[] array) {
		return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
	}

}
