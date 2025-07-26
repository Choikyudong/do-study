package leetcode.pack5;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/running-sum-of-1d-array/description/">
 * 문제링크
 * </a>
 */
public class Solution17 {

	public static void main(String[] args) {
		Solution17 solution = new Solution17();

		// 테스트1 : [1,3,6,10]
		System.out.println(Arrays.toString(solution.runningSum(new int[]{1,2,3,4})));

		// 테스트2 : [1,2,3,4,5]
		System.out.println(Arrays.toString(solution.runningSum(new int[]{1,1,1,1,1})));

		// 테스트3 : [3,4,6,16,17]
		System.out.println(Arrays.toString(solution.runningSum(new int[]{3,1,2,10,1})));
	}

	public int[] runningSum(int[] nums) {
		int sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + sum;
			sum = nums[i];
		}
		return nums;
	}

}
