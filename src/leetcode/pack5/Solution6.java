package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/reverse-degree-of-a-string/description/">
 * 문제링크
 * </a>
 */
public class Solution6 {

	public static void main(String[] args) {
		Solution6 solution1 = new Solution6();

		// 테스트1 : 148
		System.out.println((solution1.reverseDegree("abc")));

		// 테스트2 : 160
		System.out.println((solution1.reverseDegree("zaza")));
	}

	public int reverseDegree(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			ans += ('z' - s.charAt(i) + 1) * (i + 1);
		}
		return ans;
	}

}
