package leetcode.pack5;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/minimum-number-game/">
 * 문제링크
 * </a>
 */
public class Solution19 {

	public static void main(String[] args) {
		Solution19 solution = new Solution19();

		// 테스트1 : [3,2,5,4]
		System.out.println((solution.numberGame(new int[]{5,4,2,3})));

		// 테스트1 : [5,2]
		System.out.println((solution.numberGame(new int[]{2,5})));
	}

	public int[] numberGame(int[] nums) {
		int length = nums.length;
		int[] ans = new int[length];
		Arrays.sort(nums);
		for (int i = 0; i < length; i += 2) {
			ans[i] = nums[i + 1];
			ans[i + 1] = nums[i];
		}
		return ans;
	}

}
