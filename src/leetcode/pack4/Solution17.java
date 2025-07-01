package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/">
 * 문제링크
 * </a>
 */
public class Solution17 {

	public static void main(String[] args) {
		Solution17 solution = new Solution17();

		// 테스트1 : 3
		System.out.println(solution.minimumOperations(new int[]{1,2,3,4}));

		// 테스트2 : 0
		System.out.println(solution.minimumOperations(new int[]{3,6,9}));
	}

	public int minimumOperations(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if ((num + 1) % 3 == 0 || (num - 1) % 3 == 0) {
				count++;
			}
		}
		return count;
	}

}
