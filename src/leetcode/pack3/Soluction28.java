package leetcode.pack3;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/concatenation-of-array/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Soluction28 {

	public static void main(String[] args) {
		Soluction28 soluction = new Soluction28();

		// 테스트1
		System.out.println(Arrays.toString(soluction.getConcatenation(
				new int[]{1,2,1}
		))); // [0,1]

		// 테스트2
		System.out.println(Arrays.toString(soluction.getConcatenation(
				new int[]{1,3,2,1}
		))); // [1,3,2,1,1,3,2,1]
	}

	public int[] getConcatenation(int[] nums) {
		int len = nums.length;
		int[] ans = new int[len * 2];
		for (int i = 0; i < len; i++) {
			ans[i] = nums[i];
			ans[i + len] = nums[i];
		}
		return ans;
	}

}
