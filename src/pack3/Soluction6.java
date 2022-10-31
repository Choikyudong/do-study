package pack3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Question : Array.diff
 * Writer : Kyudong
 * Date : 2022-10-31
 * Time : 오후 9:45
 */
public class Soluction6 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1})));
		System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {2})));
		System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {})));
		System.out.println(Arrays.toString(arrayDiff(new int [] {}, new int[] {1,2})));
		System.out.println(Arrays.toString(arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2})));
		System.out.println(Arrays.toString(arrayDiff(new int[] {-20, -20, 2, 13, -6, -2, 7, 15}, new int[] {-20, -20, 13, -6, 7, 15})));
		System.out.println(Arrays.toString(arrayDiff(new int [] {-20, 5, 5, 5, 5, 5, -11, 42, 0, 55, 0, 0, 1}, new int[] {-20, 5, -11, 42, 55, 0, 1})));
	}

	/**
	 * a 배열에서 b의 요솟값을 제거하고 반환한다.
	 *
	 * @param a int[]
	 * @param b int[]
	 * @return int[]
	 */
	public static int[] arrayDiff(int[] a, int[] b) {
		if (a.length == 0 || b.length == 0) {
			return a;
		}

		StringBuilder sb = new StringBuilder();
		outerLoop :
		for (var i : a) {
			for (var j : b) {
				if (i == j) {
					continue outerLoop;
				}
			}
			sb.append(i).append(" ");
		}

		if (!sb.toString().isEmpty()) {
			String[] arr = sb.toString().split("\\s");
			a = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				a[i] = Integer.parseInt(arr[i]);
			}
		} else {
			return new int[0];
		}

		return a;
	}

}