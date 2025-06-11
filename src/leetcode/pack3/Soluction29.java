package leetcode.pack3;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/?envType=problem-list-v2&envId=array">
 * 문제링크
 * </a>
 */
public class Soluction29 {

	public static void main(String[] args) {
		Soluction29 soluction = new Soluction29();

		// 테스트1
		System.out.println(Arrays.toString(soluction.minOperations("110"))); // [1,1,3]

		// 테스트2
		System.out.println(Arrays.toString(soluction.minOperations("001011"))); // [11,8,5,4,3,4]
	}

	public int[] minOperations(String boxes) {
		final char[] boxList = boxes.toCharArray();
		final int length = boxList.length;
		final int[] ans = new int[length];

		// 왼쪽에서 오는 공
		int ball = 0;
		int steps = 0;
		for (int i = 0; i < length; i++) {
			ans[i] += steps;
			if (boxList[i] == '1') {
				ball++;
			}
			steps += ball;
		}

		// 오른쪽에서 오는 공
		ball = 0;
		steps = 0;
		for (int i = length - 1; i >= 0; i--) {
			ans[i] += steps;
			if (boxList[i] == '1') {
				ball++;
			}
			steps += ball;
		}

		return ans;
	}

}
