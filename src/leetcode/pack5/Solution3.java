package leetcode.pack5;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/left-and-right-sum-differences/description/">
 * 문제링크
 * </a>
 */
public class Solution3 {

	public static void main(String[] args) {
		Solution3 solution1 = new Solution3();

		// 테스트1 : [15,1,11,22]
		System.out.println(Arrays.toString(solution1.leftRightDifference(new int[]{10,4,8,3})));

		// 테스트2 : [0]
		System.out.println(Arrays.toString(solution1.leftRightDifference(new int[]{1})));
	}

	public int[] leftRightDifference(int[] nums) {
		int len = nums.length;
		int[] leftSum = new int[len];
		for (int i = 1; i < len; i++) {
			leftSum[i] = nums[i - 1] + leftSum[i - 1];
		}

		int[] rightSum = new int[len];
		for (int i = len - 2; i >= 0; i--) {
			rightSum[i] = nums[i + 1] + rightSum[i + 1];
		}

		int[] ans = new int[len];
		for (int i = 0; i < len; i++) {
			ans[i] = Math.abs(leftSum[i] - rightSum[i]);
		}
		return ans;
	}

}
