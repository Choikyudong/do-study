package pack;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Question : Count by X
 * Writer : Kyudong
 * Date : 2022-09-11
 * Time : 오전 1:19
 */
public class Soluction7 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Soluction7.countBy(1, 10)));
		System.out.println(Arrays.toString(Soluction7.countBy(2, 5)));
		System.out.println(Arrays.toString(Soluction7.countBy(3, 7)));
		System.out.println(Arrays.toString(Soluction7.countBy(100, 6)));
	}

	/**
	 * 시작값의 곱하기 반복 수를 통해 완성된 int[]를 반환한다.
	 *
	 * 예시)
	 * x = 1, n = 10 -> {1,2,3,4,5,6,7,8,9,10}
	 *
	 * @param x 시작값
	 * @param n 곱하기 반복 수
	 * @return 매개변수를 통해 완성된 int[]
	 */
//	public static int[] countBy(int x, int n){
//		int[] arr = new int[n];
//
//		int number = x;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = number;
//			number += x;
//		}
//
//		return arr;
//	}

	/**
	 * 스트림으로 풀어봄
	 *
	 * range()와 rangeClosed()는 둘 다 범우의 숫자를 차례대로 생성해준다.
	 * 차이점은 Closed는 끝 숫자를 포함시키는 것이다.
	 *
	 * @param x 시작값
	 * @param n 곱하기 반복 수
	 * @return 매개변수를 통해 완성된 int[]
	 */
	public static int[] countBy(int x, int n){
		return IntStream.rangeClosed(1, n).map(number -> number * x).toArray();
	}

}
