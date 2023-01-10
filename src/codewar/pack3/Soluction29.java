package codewar.pack3;

import java.util.Arrays;

/**
 * Question : Delete occurrences of an element if it occurs more than n times
 * Writer : Kyudong
 * Date : 2022-12-20
 * Time : PM 10:20
 */
public class Soluction29 {

	public static void main(String[] args) {
//		System.out.println(Arrays.toString(deleteNth(new int[] { 20, 37, 20, 21 }, 1)));
//		System.out.println(Arrays.toString(deleteNth(new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3)));
//		System.out.println(Arrays.toString(deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3)));
//		System.out.println(Arrays.toString(deleteNth(new int[] { 1, 1, 1, 1, 1 }, 5)));
//		System.out.println(Arrays.toString(deleteNth(new int[] { }, 5)));
		System.out.println(Arrays.toString(deleteNth(new int[] { 34, 40, 7, 15, 32, 37, 44, 32, 21, 29, 9, 32, 5, 13, 1, 38, 33, 4, 21, 6, 1, 47, 14, 3, 28, 19, 6, 17, 39, 26, 19, 39, 40, 20, 17, 19, 21, 14, 27, 24, 46, 0, 38, 19, 4, 1, 26, 27 }, 0)));
	}

	/**
	 * elements 배열의 값들을 maxOccurrences 횟수만 값을 담는다.
	 * @param elements int[]
	 * @param maxOccurrences 반복되는 숫자 제한 수
	 * @return int[]
	 */
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		if (maxOccurrences == 0)
			return new int[0];

		int number;
		int count;
		int comPareNumber;
		int totalCount = 0;
		for (int i = 0; i < elements.length; i++) {
			count = 0;
			number = elements[i];
			if (!(number == Integer.MIN_VALUE)) {
				for (int j = i + 1; j < elements.length; j++) {
					comPareNumber = elements[j];
					if (number == comPareNumber) {
						count++;
						if (count >= maxOccurrences) {
							elements[j] = Integer.MIN_VALUE;
							totalCount++;
						}
					}
				}
			}
		}
		int[] result = new int[elements.length - totalCount];

		int i = 0;
		for (var value : elements) {
			if (!(value == Integer.MIN_VALUE)) {
				result[i++] = value;
			}
		}

		return result;
	}

}
