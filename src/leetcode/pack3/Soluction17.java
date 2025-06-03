package leetcode.pack3;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction17 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(minimumSum(2932)); // 53

		// 테스트2
		System.out.println(minimumSum(4009)); // 13
	}

	public static int minimumSum(int num) {
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = num % 10;
			num /= 10;
		}
		Arrays.sort(arr);

		int new1 = (arr[0] * 10) + arr[3];
		int new2 = (arr[1] * 10) + arr[2];
		return new1 + new2;
	}

}
