package leetcode.pack3;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/build-array-from-permutation/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Soluction26 {

	public static void main(String[] args) {
		Soluction26 soluction26 = new Soluction26();

		// 테스트1
		System.out.println(Arrays.toString(
				soluction26.buildArray(new int[]{0,2,1,5,3,4})
		)); // [0,1,2,4,5,3]
	}

	public int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}

		return ans;
	}

}
