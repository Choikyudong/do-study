package leetcode.pack6;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/defuse-the-bomb/description/">
 * 문제링크
 * </a>
 */
public class Solution18 {

	public static void main(String[] args) {
		Solution18 solution = new Solution18();

		// 테스트1 : [12,10,16,13]
		System.out.println(Arrays.toString(solution.decrypt(new int[]{5,7,1,4}, 3)));

		// 테스트2 : [0,0,0,0]
		System.out.println(Arrays.toString(solution.decrypt(new int[]{1,2,3,4}, 0)));

		// 테스트3 : [0,0,0,0]
		System.out.println(Arrays.toString(solution.decrypt(new int[]{2,4,9,3}, -2)));
	}

	/* 단순반복
	public int[] decrypt(int[] code, int k) {
		int length = code.length;
		int[] ans = new int[length];
		if (k == 0) {
			return ans;
		}

		if (k > 0) {
			for (int i = 0; i < length; i++) {
				int sum = 0;
				int index = i;
				for (int j = 0; j < k; j++) {
					sum += code[(index++ + 1) % length];
				}
				ans[i] = sum;
			}
		} else {
			int repeat = Math.abs(k);
			for (int i = 0; i < length; i++) {
				int sum = 0;
				int index = i;
				for (int j = 0; j < repeat; j++) {
					index = (index - 1 + length) % length; // 뒤로 이동
					sum += code[index];
				}
				ans[i] = sum;
			}
		}


		return ans;
	}
	*/

	public int[] decrypt(int[] code, int k) {
		int length = code.length;
		int[] ans = new int[length];
		if (k == 0) {
			return ans;
		}

		int start;
		int end;
		int sum = 0;
		if (k > 0) {
			start = 1;
			end = k;
			for (int i = start; i <= end; i++) {
				sum += code[i % length];
			}
			for (int i = 0; i < length; i++) {
				ans[i] = sum;
				sum -= code[start++ % length];
				sum += code[++end % length];
			}
		} else {
			start = length - Math.abs(k);
			end = length - 1;
			for (int i = start; i <= end; i++) {
				sum += code[i % length];
			}
			for (int i = 0; i < length; i++) {
				ans[i] = sum;
				sum -= code[start++ % length];
				sum += code[++end % length];
			}
		}


		return ans;
	}

}
