package leetcode.pack2;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/counting-bits/description/?envType=problem-list-v2&envId=dynamic-programming">
 * 문제링크
 * </a>
 */
public class Soluction28 {

	public static void main(String[] args) {
		// 테스트 1
		System.out.println(Arrays.toString(countBits(2))); // [0,1,1]

		// 테스트 2
		System.out.println(Arrays.toString(countBits(5))); // [0,1,1,2,1,2]

		// 테스트 3
		System.out.println(Arrays.toString(countBits(4))); // [0,1,1,2,1]

		System.out.println(Arrays.toString(countBits(19))); // [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3]
	}

	/*public static int[] countBits(int n) {
		int[] result = new int[n + 1];

		for (int i = 0; i <= n; i += 4) {
			String bin = Integer.toBinaryString(i);
			int count = 0;
			for (int j = 0; j < bin.length(); j++) {
				if (bin.charAt(j) == '1') {
					count++;
				}
			}
			result[i] = count;
			if (i + 1 <= n) {
				result[i + 1] = count + 1;
			}
			if (i + 2 <= n) {
				result[i + 2] = count + 1;
			}
			if (i + 3 <= n) {
				result[i + 3] = count + 2;
			}
		}

		return result;
	}*/

	/* 이런 메서드가 있네;
	public static int[] countBits(int n) {
		int[] result = new int[n + 1];

		for (int i = 0; i <= n; i ++) {
			result[i] = Integer.bitCount(i);
		}

		return result;
	}*/

	public static int[] countBits(int n) {
		int[] result = new int[n + 1];

		for (int i = 0; i <= n; i ++) {
			result[i] = result[i >> 1] + (i & 1);
		}

		return result;
	}

}
