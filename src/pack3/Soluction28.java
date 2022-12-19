package pack3;

import java.util.Arrays;

/**
 * Question : Tribonacci Sequence
 * Writer : Kyudong
 * Date : 2022-12-19
 * Time : PM 9:52
 */
public class Soluction28 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(tribonacci(new double []{0,0,1},10)));
		System.out.println(Arrays.toString(tribonacci(new double []{0,1,1},10)));
		System.out.println(Arrays.toString(tribonacci(new double []{8.0, 8.0, 7.0},1)));
		System.out.println(Arrays.toString(tribonacci(new double []{8.0, 8.0, 7.0},0)));
	}

	/**
	 * 파보나치의 수를 3개로 만들어라
	 * 예시)
	 * [1,1,1] -> [1, 1 ,1, 3, 5, 9, 17, 31, ...]
	 * @param s 배열
	 * @param n 목표 수 길이
	 * @return 목표 수 길이에 의해 만들어진 배열
	 */
	static double[] tribonacci(double[] s, int n) {
		double[] result = new double[n];

		for (int i = 0; i < result.length; i++) {
			result[i] = s[i];
			if (s.length - 1 == i)
				break;
		}

		for (int i = 3; i < n; i++) {
			result[i] = result[i - 1] + result[i - 2] + result[i - 3];
		}

		return result;
	}



}
