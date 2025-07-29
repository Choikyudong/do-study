package leetcode.pack5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/encode-and-decode-tinyurl/">
 * 문제링크
 * </a>
 */
public class Solution22 {

	public static void main(String[] args) {
		Solution22 solution = new Solution22();

		// 테스트1 : [0,4,1,3,2]
		System.out.println(Arrays.toString(
				solution.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})
		));

		// 테스트2 : [0,1,2,3,4]
		System.out.println(Arrays.toString(
				solution.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0})
		));
	}

	/* 느리네?
	public int[] createTargetArray(int[] nums, int[] index) {
		int length = nums.length;
		int[] target = new int[length];
		for (int i = 0; i < length; i++) {
			int targetIndex = index[i];
			for (int j = length - 1; j > targetIndex; j--) {
				target[j] = target[j - 1];
			}
			target[targetIndex] = nums[i];
		}

		return target;
	}
	*/

	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> list = new LinkedList<>();
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			list.add(index[i], nums[i]);
		}

		int[] taregt = new int[length];
		for (int i = 0; i < length; i++) {
			taregt[i] = list.get(i);
		}
		return taregt;
	}

}
