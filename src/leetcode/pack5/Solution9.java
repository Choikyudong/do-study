package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/">
 * 문제링크
 * </a>
 */
public class Solution9 {

	public static void main(String[] args) {
		Solution9 solution = new Solution9();

		// 테스트1 : 4
		System.out.println((solution.minOperations(new int[]{3,9,7}, 5)));

		// 테스트2 : 0
		System.out.println((solution.minOperations(new int[]{4,1,3}, 4)));

		// 테스트3 : 5
		System.out.println((solution.minOperations(new int[]{3,2}, 6)));
	}

	public int minOperations(int[] nums, int k) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum % k;
	}

}
