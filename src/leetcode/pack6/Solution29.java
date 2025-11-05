package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/">
 * 문제링크
 * </a>
 */
public class Solution29 {

	public static void main(String[] args) {
		Solution29 solution = new Solution29();

		// 테스트1 : true
		System.out.println(solution.numberOfPairs(new int[]{1,3,4}, new int[]{1,3,4}, 1));

		// 테스트2 : false
		System.out.println(solution.numberOfPairs(new int[]{1,2,4,12}, new int[]{2,4}, 3));
	}

	public int numberOfPairs(int[] nums1, int[] nums2, int k) {
		int ans = 0;
		for (int num1 : nums1) {
			for (int num2 : nums2) {
				if (num1 % (num2 * k) == 0) {
					ans++;
				}
			}
		}
		return ans;
	}

}

