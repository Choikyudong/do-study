package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/encode-and-decode-tinyurl/">
 * 문제링크
 * </a>
 */
public class Solution24 {

	public static void main(String[] args) {
		Solution24 solution = new Solution24();

		// 테스트1 : 21
		System.out.println((solution.sumOfMultiples(7)));

		// 테스트2 : 40
		System.out.println((solution.sumOfMultiples(10)));
	}

	public int sumOfMultiples(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
