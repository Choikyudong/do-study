package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/">
 * 문제링크
 * </a>
 */
public class Solution15 {

	public static void main(String[] args) {
		Solution15 solution = new Solution15();

		// 테스트1 : 58
		System.out.println((solution.maximizeSum(
				new int[]{1,2,3,4,5}, 3
		)));

		// 테스트2 : 3
		System.out.println((solution.maximizeSum(
				new int[]{5,5,5}, 2
		)));
	}

	public int maximizeSum(int[] nums, int k) {
		int max = 0;
		for (int num : nums) {
			max = Math.max(max, num);
		}
		return k * max + (k * (k - 1)) / 2;
	}

}
