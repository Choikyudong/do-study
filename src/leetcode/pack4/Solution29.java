package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/">
 * 문제링크
 * </a>
 */
public class Solution29 {

	public static void main(String[] args) {
		Solution29 solution = new Solution29();

		// 테스트1 : 3
		System.out.println(solution.minBitFlips(10, 7));

		// 테스트2 : 3
		System.out.println(solution.minBitFlips(3, 4));
	}

	public int minBitFlips(int start, int goal) {
		int xor = start ^ goal;
		int count = 0;
		while (xor > 0) {
			count += xor & 1;
			xor >>= 1;
		}
		return count;
	}

}
