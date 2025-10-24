package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/?envType=daily-question&envId=2025-10-23">
 * 문제링크
 * </a>
 */
public class Solution27 {

	public static void main(String[] args) {
		Solution27 solution = new Solution27();

		// 테스트1 : 1
		System.out.println(solution.singleNumber(new int[]{2,2,1}));

		// 테스트2 : 4
		System.out.println(solution.singleNumber(new int[]{4,1,2,1,2}));

		// 테스트3 : 1
		System.out.println(solution.singleNumber(new int[]{1}));
	}

	public int singleNumber(int[] nums) {
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			result ^= nums[i];
		}

		return result;
	}

}

