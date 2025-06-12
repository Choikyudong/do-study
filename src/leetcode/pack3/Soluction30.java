package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Soluction30 {

	public static void main(String[] args) {
		Soluction30 soluction = new Soluction30();

		// 테스트1
		System.out.println(soluction.subsetXORSum(new int[]{1,3})); // 6

		// 테스트2
		System.out.println(soluction.subsetXORSum(new int[]{5,1,6})); // 28

		// 테스트3
		System.out.println(soluction.subsetXORSum(new int[]{3,4,5,6,7,8})); // 480
	}

	public int subsetXORSum(int[] nums) {
		return helper(nums, 0, 0);
	}

	private int helper(int[] nums, int currentXor, int index) {
		if (index == nums.length) {
			return currentXor;
		}

		int include = helper(nums, currentXor ^ nums[index], index + 1);
		int exclude = helper(nums, currentXor, index + 1);
		return include + exclude;
	}

}
