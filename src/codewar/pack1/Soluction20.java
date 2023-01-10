package codewar.pack1;

import java.util.stream.IntStream;

/**
 * Question : Calculate average
 * Writer : Kyudong
 * Date : 2022-09-19
 * Time : 오후 11:18
 */
public class Soluction20 {

	public static void main(String[] args) {
		System.out.println(find_average(new int[]{1,1,1}));
		System.out.println(find_average(new int[]{1,2,3}));
		System.out.println(find_average(new int[]{1,2,3,4,5}));
		System.out.println(find_average(new int[]{}));
	}

	/**
	 * 배열 요소의 평균값을 반환한다, 비어있는 배열은 0을 반환한다.
	 *
	 * @param array 배열
	 * @return array의 평균값
	 */
//	public static double find_average(int[] array){
//		if (array.length == 0) {
//			return 0;
//		}
//		int sum = 0;
//		for (int n : array) {
//			sum += n;
//		}
//		return (double) sum / array.length;
//	}

	/**
	 * 배열 요소의 평균값을 반환한다, 비어있는 배열은 0을 반환한다.
	 *
	 * orElse로 하면 된다.
	 *
	 * @param array 배열
	 * @return array의 평균값
	 */
	public static double find_average(int[] array){
		return IntStream.of(array).average().orElse(0);
	}

}
