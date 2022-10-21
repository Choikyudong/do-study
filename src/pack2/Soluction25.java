package pack2;

/**
 * Question : Sum of odd numbers
 * Writer : Kyudong
 * Date : 2022-10-22
 * Time : 오전 12:05
 */
public class Soluction25 {

	public static void main(String[] args) {
		System.out.println(rowSumOddNumbers(1));
		System.out.println(rowSumOddNumbers(4));
		System.out.println(rowSumOddNumbers(9));
		System.out.println(rowSumOddNumbers(42));
	}

	/**
	 * 아래의 삼각형처럼 수가 존재할 때 해당 로우의 합을 반환한다.
	 *
	 * 삼각형 예시)
	 *              1
	 *           3     5
	 *        7     9    11
	 *    13    15    17    19
	 * 21    23    25    27    29
	 * ...
	 *
	 * 정답 예시)
	 * n = 1 -->  1
	 * n = 2 --> 3 + 5 = 8
	 *
	 * @param n 반환할 로우
	 * @return 해당 로우의 총합
	 */
//	public static int rowSumOddNumbers(int n) {
//		int findNumberPattern = 1;
//
//		for (int i = 0; i < n; i++) {
//			findNumberPattern += i * 2;
//		}
//
//		int result = 0;
//		for (int i = 1; i <= n; i++) {
//			result += findNumberPattern;
//			findNumberPattern += 2;
//		}
//
//		return result;
//	}

	/**
	 * 그냥 단순하게 생각하면 훨씬 쉬운 문제였음;;;
	 *
	 * 해당 로우의 값들을 보면 해당 숫자의 제곱값이다..
	 * 위의 메서드는 패턴의 '첫문자'를 구하는데 집중했고
	 * 해당 메서드는 로우의 '합'을 구하는데 집중했다.
	 *
	 * @param n 반환할 로우
	 * @return 해당 로우의 총합
	 */
	public static int rowSumOddNumbers(int n) {
		return n * n * n;
	}

}
