package programmers.pack1;

import java.util.Arrays;

/**
 * Question : 분수의 덧셈
 * Writer : Kyudong
 * Date : 2023-03-21
 * Time : 오후 11:05
 */
public class Soluction8 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
		System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
	}

	/**
	 * 두 분수를 더한 값을 기약분수로 나타냈을 때
	 * 분자와 분모를 순서대로 담는 배열을 반환한다.
	 * @param numer1 분자
	 * @param denom1 분모
	 * @param numer2 분자
	 * @param denom2 분모
	 * @return int[] 분자와 분모를 순서대로 담는 배열 
	 */
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int numerator = (numer1 * denom2) + (numer2 * denom1);
		int denominator = denom1 * denom2;

		for(int i = numerator - 1; i > 1; i--) {
			// 기약분수로 만들기
			if(numerator % i == 0 && denominator % i == 0) {
				numerator /= i;
				denominator /= i;
			}
		}

		return new int[]{numerator, denominator};
	}

}
