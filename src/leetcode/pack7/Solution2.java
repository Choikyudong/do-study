package leetcode.pack7;

/**
 * <a href="https://leetcode.com/problems/find-the-integer-added-to-array-i/description/">
 * 문제링크
 * </a>
 */
public class Solution2 {

	public static void main(String[] args) {
		Solution2 solution = new Solution2();

		// 테스트1
		System.out.println(solution.addedInteger(new int[]{2,6,4}, new int[]{9,7,5}));

		// 테스트2
		System.out.println(solution.addedInteger(new int[]{10}, new int[]{5}));

		// 테스트3
		System.out.println(solution.addedInteger(new int[]{1,1,1,1}, new int[]{1,1,1,1}));
	}

	public int addedInteger(int[] nums1, int[] nums2) {
		int min1 = 1001;
		int min2 = 1001;
		int length = nums1.length;
		for (int i = 0; i < length; i++) {
			min1 = Math.min(nums1[i], min1);
			min2 = Math.min(nums2[i], min2);
		}

		return min2 - min1;
	}

}
