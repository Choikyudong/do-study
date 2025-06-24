package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/">
 * 문제링크
 * </a>
 */
public class Solution10 {

	public static void main(String[] args) {
		Solution10 solution = new Solution10();

		// 테스트1
		System.out.println(solution.differenceOfSums(10, 3)); // 19

		// 테스트2
		System.out.println(solution.differenceOfSums(5, 6)); // 15
	}

	public int differenceOfSums(int n, int m) {
		int num1 = 0;
		int num2 = 0;
		for (int i = 1; i <= n; i++) {
			if (i % m != 0) {
				num1 += i;
			}
			if (i % m == 0) {
				num2 += i;
			}
		}
		return num1 - num2;
	}
	
}
