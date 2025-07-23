package leetcode.pack5;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/">
 * 문제링크
 * </a>
 */
public class Solution12 {

	public static void main(String[] args) {
		Solution12 solution = new Solution12();

		// 테스트1 : 19
		System.out.println(Arrays.toString(solution.findThePrefixCommonArray(
				new int[]{1,3,2,4},
				new int[]{3,1,2,4}
		)));

		// 테스트2 : 20
		System.out.println(Arrays.toString(solution.findThePrefixCommonArray(
				new int[]{2,3,1},
				new int[]{3,1,2}
		)));
	}

	/* 조금 아쉽
	public int[] findThePrefixCommonArray(int[] A, int[] B) {
		int len = A.length;
		Map<Integer, Integer> map = new HashMap<>();
		int[] ans = new int[len];
		map.put(A[0], 0);
		map.put(B[0], 0);
		if (A[0] == B[0]) {
			ans[0] = 1;
		}

		for (int i = 1; i < len; i++) {
			int count = ans[i - 1];
			if (map.containsKey(A[i])) {
				count++;
			}
			map.put(A[i], i);

			if (map.containsKey(B[i])) {
				count++;
			}
			map.put(B[i], i);
			ans[i] = count;
		}

		return ans;
	}
	*/

	public int[] findThePrefixCommonArray(int[] A, int[] B) {
		int len = A.length;
		int[] ans = new int[len];
		int num = 0;
		boolean[] existsNum = new boolean[len + 1];
		for (int i = 0; i < len; i++) {
			if (existsNum[A[i]]) {
				num++;
			}
			existsNum[A[i]] = true;

			if (existsNum[B[i]]) {
				num++;
			}
			existsNum[B[i]] = true;

			ans[i] = num;
		}
		return ans;
	}

}
