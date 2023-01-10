package codewar.pack1;

import java.util.Arrays;

/**
 * Question : Count of positives / sum of negatives
 * Writer : Kyudong
 * Date : 2022-09-27
 * Time : 오후 11:23
 */
public class Soluction30 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
	}

	/**
	 * 주어진 배열에서 양의 정수의 갯수를 반환하고 음의 정수는 모두 더해서 반환한다.
	 *
	 * 만약 new int[] 주어진 배열이 값이 없거나 null이면 새로운 배열을 반환한다.
	 *
	 * @param input 배열
	 * @return arr[0]은 양의 정수의 갯수 arr[1]은 음의 정수의 합
	 */
	public static int[] countPositivesSumNegatives(int[] input) {
		if (input == null || input.length == 0) {
			return new int[]{};
		}

		int[] arr = new int[2];
		for (int i : input) {
			if (i > 0) {
				arr[0]++;
			} else {
				arr[1] += i;
			}
		}
		return arr;
	}

}
