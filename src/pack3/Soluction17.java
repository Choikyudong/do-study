package pack3;

import java.util.Arrays;

/**
 * Question : Find the unique number
 * Writer : Kyudong
 * Date : 2022-11-28
 * Time : PM 10:41
 */
public class Soluction17 {

	public static void main(String[] args) {
		System.out.println(findUniq(new double[]{0, 1, 0}));
		System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
		System.out.println(findUniq(new double[]{92.0, 48.0, 48.0, 48.0, 48.0, 48.0,48.0, 48.0, 48.0, 48.0,48.0, 48.0, 48.0, 48.0}));
	}

	/**
	 * 최소 3의 길이를 가진 배열에서 혼자 다른 값을 찾는다.
	 *
	 * @param arr 배열
	 * @return 자기 혼자만 다른값
	 */
//	public static double findUniq(double[] arr) {
//		double firstNumber = arr[0];
//		double secondNumber = 0;
//		double result = 0;
//
//		int count1 = 0;
//		int count2 = 0;
//		for (double number : arr) {
//			if (firstNumber != number) {
//				secondNumber = number;
//				count1++;
//			} else {
//				count2++;
//			}
//
//			if (count1 >= 2) {
//				result = firstNumber;
//			} else if (count2 >= 2) {
//				result = secondNumber;
//			}
//		}
//
//		return result;
//	}

	/**
	 * 그냥 간단하게 배열 정렬하고 시작하면 정말 간단한 문제였음..
	 *
	 * @param arr 배열
	 * @return 자기 혼자만 다른값
	 */
	public static double findUniq(double[] arr) {
		Arrays.sort(arr);
		return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
	}

}
