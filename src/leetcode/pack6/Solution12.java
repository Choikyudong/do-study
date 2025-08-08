package leetcode.pack6;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/decompress-run-length-encoded-list/description/">
 * 문제링크
 * </a>
 */
public class Solution12 {

	public static void main(String[] args) {
		Solution12 solution = new Solution12();

		// 테스트1 : [2,4,4,4]
		System.out.println(Arrays.toString(solution.decompressRLElist(
				new int[]{1,2,3,4}
		)));

		// 테스트2 : [1,3,3]
		System.out.println(Arrays.toString(solution.decompressRLElist(
				new int[]{1,1,2,3}
		)));
	}

	public int[] decompressRLElist(int[] nums) {
		int[][] pairs = new int[nums.length / 2][2];
		for (int i = 0, j = 0; i < nums.length; i += 2, j++) {
			pairs[j][0] = nums[i];
			pairs[j][1] = nums[i + 1];
		}

		int totalFreq = 0;
		for (int[] pair : pairs) {
			totalFreq += pair[0];
		}

		int[] ans = new int[totalFreq];
		int index = 0;
		for (int[] pair : pairs) {
			int freq = pair[0];
			for (int j = 0; j < freq; j++) {
				ans[index++] = pair[1];
			}
		}

		return ans;
	}

}
