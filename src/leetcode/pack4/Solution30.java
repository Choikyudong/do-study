package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/maximum-strong-pair-xor-i/description/">
 * 문제링크
 * </a>
 */
public class Solution30 {

	public static void main(String[] args) {
		Solution30 solution = new Solution30();

		// 테스트1 : 7
		System.out.println(solution.maximumStrongPairXor(new int[]{1,2,3,4,5}));

		// 테스트2 : 0
		System.out.println(solution.maximumStrongPairXor(new int[]{10, 100}));
	}

	public int maximumStrongPairXor(int[] nums) {
		int result = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
					result = Math.max(nums[i] ^ nums[j], result);
				}
			}
		}

		return result;
	}

}
