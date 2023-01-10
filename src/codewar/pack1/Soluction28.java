package codewar.pack1;

/**
 * Question : Grasshopper - Summation
 * Writer : Kyudong
 * Date : 2022-09-26
 * Time : 오후 11:56
 */
public class Soluction28 {

	public static void main(String[] args) {
		System.out.println(summation(1));
		System.out.println(summation(8));
	}

	/**
	 * 주어진 n까지 1씩 더하는 값을 반환한다.
	 *
	 * @param n 0보다 큰 정수
	 * @return 더한값
	 */
//	public static int summation(int n) {
//		return IntStream.rangeClosed(1, n).sum();
//	}

	/**
	 * 주어진 n까지 1씩 더하는 값을 반환한다.
	 *
	 * @param n 0보다 큰 정수
	 * @return 더한값
	 */
//	public static int summation(int n) {
//		int sum = 0;
//
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}
//
//		return sum;
//	}

	/**
	 * 수학적으로 풀어본 로직을 가져와봄
	 *
	 * @param n 0보다 큰 정수
	 * @return 더한값
	 */
	public static int summation(int n) {
		return n*(n+1)/2;
	}

}
