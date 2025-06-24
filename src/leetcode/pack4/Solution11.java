package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/">
 * 문제링크
 * </a>
 */
public class Solution11 {

	public static void main(String[] args) {
		Solution11 solution = new Solution11();

		// 테스트1
		System.out.println(solution.theMaximumAchievableX(4, 1)); // 6

		// 테스트2
		System.out.println(solution.theMaximumAchievableX(3, 2)); // 7
	}

	public int theMaximumAchievableX(int num, int t) {
		return num + (2 * t);
	}
	
}
