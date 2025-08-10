package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/determine-if-string-halves-are-alike/">
 * 문제링크
 * </a>
 */
public class Solution17 {

	public static void main(String[] args) {
		Solution17 solution = new Solution17();

		// 테스트1 : 2
		System.out.println((solution.countKeyChanges("aAbBcC")));

		// 테스트2 : 0
		System.out.println((solution.countKeyChanges("AaAaAaaA")));
	}

	public int countKeyChanges(String s) {
		if (s.length() < 1) {
			return 0;
		}

		int ans = 0;
		char prevKey = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char curKey = s.charAt(i);
			if (prevKey != curKey && Math.abs(prevKey - curKey) != 32) {
				ans++;
			}
			prevKey = curKey;
		}

		return ans;
	}

}
