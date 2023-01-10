package codewar.pack3;

/**
 * Question : Multiples of 3 or 5
 * Writer : Kyudong
 * Date : 2022-10-26
 * Time : 오전 12:51
 */
public class Soluction1 {

	public static void main(String[] args) {
		System.out.println(solution(-5));
		System.out.println(solution(10));
		System.out.println(solution(20));
	}

	/**
	 * 주어진 숫자 number전까지 3 또는 5 배수 합계를 반환한다.
	 *
	 * 0일 경우 0을 반환한다.
	 *
	 * @param number int
	 * @return 합한 수
	 */
	static int solution(int number) {
		int result = 0;
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		return result;
	}

	/**
	 * 주어진 숫자 number전까지 3 또는 5 배수 합계를 반환한다.
	 *
	 * @param number int
	 * @return 합한 수
	 */
//	static int solution(int number) {
//		return IntStream.range(1, number)
//				.filter(n -> n % 3 == 0 || n % 5 == 0).sum();
//	}

}
