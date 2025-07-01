package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/richest-customer-wealth/description/">
 * 문제링크
 * </a>
 */
public class Solution18 {

	public static void main(String[] args) {
		Solution18 solution = new Solution18();

		// 테스트1 : 6
		System.out.println(solution.maximumWealth(new int[][]{
				{1,2,3},{3,2,1}
		}));

		// 테스트2 : 10
		System.out.println(solution.maximumWealth(new int[][]{
				{1,5},{7,3},{3,5}
		}));
	}

	public int maximumWealth(int[][] accounts) {
		int max = 0;
		for (int[] account : accounts) {
			int sum = 0;
			for (int acc : account) {
				sum += acc;
			}
			max = Math.max(max, sum);
		}
		return max;
	}

}
