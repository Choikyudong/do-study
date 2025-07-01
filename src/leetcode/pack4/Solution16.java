package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/shuffle-the-array/description/">
 * 문제링크
 * </a>
 */
public class Solution16 {

	public static void main(String[] args) {
		Solution16 solution = new Solution16();

		// 테스트1 : [1,2,1,2]
		System.out.println(solution.shuffle(new int[]{1,1,2,2}, 2));

		// 테스트2 : [2,3,5,4,1,7]
		System.out.println(solution.shuffle(new int[]{2,5,1,3,4,7}, 3));

		// 테스트3 : [1,4,2,3,3,2,4,1]
		System.out.println(solution.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4));
	}

	public int[] shuffle(int[] nums, int n) {
		int len = nums.length;
		int[] ans = new int[len];
		int x = 0;
		int y = n;
		for (int i = 0; i < len; i += 2) {
			ans[i] = nums[x++];
			ans[i + 1] = nums[y++];
		}

		return ans;
	}

}
