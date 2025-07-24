package leetcode.pack5;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/">
 * 문제링크
 * </a>
 */
public class Solution13 {

	public static void main(String[] args) {
		Solution13 solution = new Solution13();

		// 테스트1 : [8,4,6,5,6]
		System.out.println(Arrays.toString(solution.getFinalState(
				new int[]{2,1,3,5,6}, 5, 2
		)));

		// 테스트2 : [16,8]
		System.out.println(Arrays.toString(solution.getFinalState(
				new int[]{1,2}, 3, 4
		)));
	}

	public int[] getFinalState(int[] nums, int k, int multiplier) {
		for (int count = 1; count <= k; count++) {
			int minIndex = 0;
			for (int index = 0; index < nums.length; index++) {
				if (nums[index] < nums[minIndex]) {
					minIndex = index;
				}
			}
			nums[minIndex] *= multiplier;
		}
		return nums;
	}

}
