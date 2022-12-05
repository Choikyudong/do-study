package pack3;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Question : Sort the odd
 * Writer : Kyudong
 * Date : 2022-12-05
 * Time : PM 11:12
 */
public class Soluction20 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
		System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 1, 8, 0 })));
		System.out.println(Arrays.toString(sortArray(new int[]{})));
	}

	/**
	 * 짝수는 그대로 두고 홀수만 오름차순으로 정렬한다.
	 *
	 * @param array int[]
	 * @return 정렬된 배열
	 */
//	public static int[] sortArray(int[] array) {
//		int index = 0;
//		for (var num : array) {
//			if (num % 2 != 0)
//				index++;
//		}
//
//		int[] arr = new int[index];
//
//		index = 0;
//		for (var num : array) {
//			if (num % 2 != 0)
//				arr[index++] = num;
//		}
//
//		Arrays.sort(arr);
//
//		for (int j = 0, k = 0; j < array.length; j++) {
//			if (array[j] % 2 != 0)
//				array[j] = arr[k++];
//		}
//
//		return array;
//	}

	/**
	 * 오랜만에 스트림 좀 사용해봄
	 *
	 * @param array int[]
	 * @return 정렬된 배열
	 */
	public static int[] sortArray(int[] array) {
		int[] arr = IntStream.of(array).filter(n -> n % 2 != 0).sorted().toArray();

		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				array[i] = arr[j++];
		}

		return array;
	}

}
