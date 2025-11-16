package leetcode.pack7;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-the-integer-added-to-array-i/description/">
 * 문제링크
 * </a>
 */
public class Solution3 {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();

		// 테스트1
		System.out.println(Arrays.toString(solution.recoverOrder(new int[]{3,1,2,5,4}, new int[]{1,3,4})));

		// 테스트2
		System.out.println(Arrays.toString(solution.recoverOrder(new int[]{1,4,5,3,2}, new int[]{2,5})));
	}

	public int[] recoverOrder(int[] order, int[] friends) {
		int[] ans = new int[friends.length];

		int index = 0;
		for (int i : order) {
			for (int j : friends) {
				if (i == j) {
					ans[index++] = i;
					break;
				}
			}
		}

		return ans;
	}

}
