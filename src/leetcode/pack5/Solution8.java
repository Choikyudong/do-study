package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">
 * 문제링크
 * </a>
 */
public class Solution8 {

	public static void main(String[] args) {
		Solution8 solution1 = new Solution8();

		// 테스트1 : [4,0,1,1,3]
		System.out.println((solution1.smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));

		// 테스트2 : [2,1,0,3]
		System.out.println((solution1.smallerNumbersThanCurrent(new int[]{6,5,4,8})));

		// 테스트3 : [0,0,0,0]
		System.out.println((solution1.smallerNumbersThanCurrent(new int[]{7,7,7,7})));
	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] counts = new int[101];
		for (int num : nums) {
			counts[num]++;
		}

		int[] prefixSums = new int[101];
		for (int i = 1; i <= 100; i++) {
			prefixSums[i] = prefixSums[i - 1] + counts[i - 1];
		}

		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = prefixSums[nums[i]];
		}
		return ans;
	}

}
