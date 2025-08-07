package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/count-of-matches-in-tournament/">
 * 문제링크
 * </a>
 */
public class Solution10 {

	public static void main(String[] args) {
		Solution10 solution = new Solution10();

		// 테스트1 : true
		System.out.println(solution.arrayStringsAreEqual(
				new String[]{"ab", "c"},
				new String[]{"a", "bc"}
		));

		// 테스트2 : false
		System.out.println(solution.arrayStringsAreEqual(
				new String[]{"a", "cb"},
				new String[]{"ab", "c"}
		));
	}

	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		for (String s : word1) {
			sb1.append(s);
		}

		StringBuilder sb2 = new StringBuilder();
		for (String s : word2) {
			sb2.append(s);
		}

		return sb1.toString().contentEquals(sb2);
	}
	
}
