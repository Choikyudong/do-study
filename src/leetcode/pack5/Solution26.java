package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix/description/">
 * 문제링크
 * </a>
 */
public class Solution26 {

	public static void main(String[] args) {
		Solution26 solution = new Solution26();

		// 테스트1 : 2
		System.out.println((solution.prefixCount(
				new String[]{"pay","attention","practice","attend"},
				"at"
		)));

		// 테스트2 : ["Bob","Alice","Bob"]
		System.out.println((solution.prefixCount(
				new String[]{"leetcode","win","loops","success"},
				"code"
		)));
	}

	public int prefixCount(String[] words, String pref) {
		int ans = 0;

		for (String word : words) {
			if (word.startsWith(pref)) {
				ans++;
			}
		}

		return ans;
	}

}
