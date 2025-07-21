package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/reverse-degree-of-a-string/description/">
 * 문제링크
 * </a>
 */
public class Solution7 {

	public static void main(String[] args) {
		Solution7 solution1 = new Solution7();

		// 테스트1 : 2
		System.out.println((solution1.findPermutationDifference("abc", "bac")));

		// 테스트2 : 12
		System.out.println((solution1.findPermutationDifference("abcde", "edbac")));
	}

	public int findPermutationDifference(String s, String t) {
		int ans = 0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (s.charAt(i) == t.charAt(j)) {
					ans += Math.abs(i - j);
				}
			}
		}
		return ans;
	}

}
