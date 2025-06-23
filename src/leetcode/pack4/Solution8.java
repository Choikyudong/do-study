package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/score-of-a-string/description/">
 * 문제링크
 * </a>
 */
public class Solution8 {

	public static void main(String[] args) {
		Solution8 solution = new Solution8();

		// 테스트1
		System.out.println(solution.scoreOfString("hello")); // 13

		// 테스트2
		System.out.println(solution.scoreOfString("zaz")); // 50
	}

	public int scoreOfString(String s) {
		int ans = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			ans += Math.abs(s.charAt(i) - s.charAt(i + 1));
		}
		return ans;
	}
	
}
