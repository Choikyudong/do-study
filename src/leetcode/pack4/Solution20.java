package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/count-the-number-of-consistent-strings/">
 * 문제링크
 * </a>
 */
public class Solution20 {

	public static void main(String[] args) {
		Solution20 solution = new Solution20();

		// 테스트1 : 2
		System.out.println(solution.countConsistentStrings(
				"ab",
				new String[]{"ad","bd","aaab","baa","badab"}
		));

		// 테스트2 : 7
		System.out.println(solution.countConsistentStrings(
				"abc",
				new String[]{"a","b","c","ab","ac","bc","abc"}
		));

		// 테스트3 : 4
		System.out.println(solution.countConsistentStrings(
				"cad",
				new String[]{"cc","acd","b","ba","bac","bad","ac","d"}
		));
	}

	public int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		for (String word : words) {
			boolean isConsistent = true;
			for (char w : word.toCharArray()) {
				if (allowed.indexOf(w) < 0) {
					isConsistent = false;
					break;
				}
			}
			if (isConsistent) {
				count++;
			}
		}
		return count;
	}

}
