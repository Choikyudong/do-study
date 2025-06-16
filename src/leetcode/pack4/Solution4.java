package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/partition-array-according-to-given-pivot/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Solution4 {

	public static void main(String[] args) {
		Solution4 solution = new Solution4();

		// 테스트1
		System.out.println(solution.pivotArray(new int[]{9,12,5,10,14,3,10}, 10)); // [9,5,3,10,10,12,14]

		// 테스트2
		System.out.println(solution.pivotArray(new int[]{-3,4,3,2}, 2)); // [-3,2,4,3]
	}

	public int[] pivotArray(int[] nums, int pivot) {
		int n = nums.length;
		int[] ans = new int[n];
		int index = 0;
		for (int num : nums) {
			if (num < pivot) {
				ans[index++] = num;
			}
		}

		for (int num : nums) {
			if (num == pivot) {
				ans[index++] = num;
			}
		}

		for (int num : nums) {
			if (num > pivot) {
				ans[index++] = num;
			}
		}

		return ans;
	}
}
