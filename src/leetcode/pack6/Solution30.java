package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/compute-alternating-sum/">
 * 문제링크
 * </a>
 */
public class Solution30 {

	public static void main(String[] args) {
		Solution30 solution = new Solution30();

		// 테스트1 : -4
		System.out.println(solution.alternatingSum(new int[]{1,3,5,7}));

		// 테스트2 : 100
		System.out.println(solution.alternatingSum(new int[]{100}));
	}

	public int alternatingSum(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			ans += i % 2 == 0 ? nums[i] : -nums[i];
		}
		return ans;
	}

}

