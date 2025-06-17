package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Solution7 {

	public static void main(String[] args) {
		Solution7 solution = new Solution7();

		// 테스트1
		System.out.println(solution.transformArray(new int[]{4,3,2,1})); // [0,0,1,1]

		// 테스트2
		System.out.println(solution.transformArray(new int[]{1,5,1,4,2})); // [0,0,1,1,1]
	}

	public int[] transformArray(int[] nums) {
		int len = nums.length;
		int odd = 0;
		for (int num : nums) {
			if (num % 2 != 0) {
				odd++;
			}
		}

		int[] ans = new int[len];
		int index = len - odd;
		for (int i = 0; i < odd; i++) {
			ans[index++] = 1;
		}

		return ans;
	}
	
}
