package pack2;

import java.util.stream.IntStream;

/**
 * Question : Beginner Series #3 Sum of Numbers
 * Writer : Kyudong
 * Date : 2022-10-16
 * Time : 오전 12:27
 */
public class Soluction18 {

	public static void main(String[] args) {
		System.out.println(GetSum(0, -1));
		System.out.println(GetSum(0, 1));
		System.out.println(GetSum(1, 2));
		System.out.println(GetSum(2, 2));
		System.out.println(GetSum(14, 1));
	}

	/**
	 * a와 b사이의 모든 값을 더해서 반환한다.
	 *
	 * 예시)
	 * (1, 0) --> 1 (1 + 0 = 1)
	 * (1, 2) --> 3 (1 + 2 = 3)
	 * (0, 1) --> 1 (0 + 1 = 1)
	 * (1, 1) --> 1 (1 since both are same)
	 * (-1, 0) --> -1 (-1 + 0 = -1)
	 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
	 *
	 * @param a int값
	 * @param b int값
	 * @return a ~ b
	 */
//	static int GetSum(int a, int b) {
//		int max = Integer.max(a, b);
//		int min = Integer.min(a, b);
//		if (max == min) {
//			return min;
//		}
//		int result = 0;
//		for (int i = min; i <= max; i++) {
//			result += i;
//		}
//		return result;
//	}

	/**
	 * a와 b사이의 모든 값을 더해서 반환한다.
	 *
	 * @param a int값
	 * @param b int값
	 * @return a ~ b
	 */
	static int GetSum(int a, int b) {
		int max = Integer.max(a, b);
		int min = Integer.min(a, b);
		return IntStream.rangeClosed(min, max).sum();
	}

}
