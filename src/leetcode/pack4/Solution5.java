package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/number-of-good-pairs/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Solution5 {

	public static void main(String[] args) {
		Solution5 solution = new Solution5();

		// 테스트1
		System.out.println(solution.numIdenticalPairs(new int[]{1,2,3,1,1,3})); // 4

		// 테스트2
		System.out.println(solution.numIdenticalPairs(new int[]{1,1,1,1})); // 6

		// 테스트3
		System.out.println(solution.numIdenticalPairs(new int[]{1,2,3})); // 0
	}

	public int numIdenticalPairs(int[] nums) {
		int pairCount = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (nums[i] == nums[j]) {
					pairCount++;
				}
			}
		}
		
		return pairCount;
	}
}
