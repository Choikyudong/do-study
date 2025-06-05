package leetcode.pack3;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-coins-you-can-get/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction20 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(maxCoins(new int[]{2,4,1,2,7,8})); // 9

		// 테스트2
		System.out.println(maxCoins(new int[]{2,4,5})); // 4

		// 테스트3
		System.out.println(maxCoins(new int[]{9,8,7,6,5,1,2,3,4})); // 18

		// 테스트3
		System.out.println(maxCoins(new int[]{4,4,17,7,16,16,16,15,2,3,1,17,6,12,9})); // 63
	}

	public static int maxCoins(int[] piles) {
		Arrays.sort(piles);
		int sum = 0;
		int n = piles.length;
		for (int i = n / 3; i < n; i += 2) {
			sum += piles[i];
		}
		return sum;
	}

}
